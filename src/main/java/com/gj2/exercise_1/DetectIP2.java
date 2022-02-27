package com.gj2.exercise_1;


public class DetectIP2 {
    //由于"255.255.255.255" 转化long型 超过了bitset的最大存储，故需要分段存储
    //下标最大值 2^32个数
    long max=4294967295l;
    //每段值大小
    int seg=500000000;
    //白名单
    public HBitset bitSetIpWhite = new HBitset(max,seg);
    //黑名单
    public HBitset bitSetIpBlack = new HBitset(max,seg);

    /**
     *设置指定的ipv4地址进入名单
     * @param ip(以*.*.*.*格式的ipv4字符串)
     * @param ipType(1白名单，2黑名单)
     *
     */
    public void SetIpInList(String ip,int ipType){
        if (isIPv4(ip)){
            if (ipType==1){
                bitSetIpWhite.set(ip2Long(ip));
            }else if (ipType==2){
                bitSetIpBlack.set(ip2Long(ip));
            }
        }
    }

    /**
     * 判断指定的ipv4地址是否在当前名单中
     *
     * @param ip(以*.*.*.*格式的ipv4字符串)
     * @return 1：在白名单中， 2: 在黑名单中， 0: 不在名单中
     */
    public int IsInList(String ip){
        if (!isIPv4(ip)) return 0;
        if (bitSetIpWhite.get(ip2Long(ip)))
            return 1;
        if (bitSetIpBlack.get(ip2Long(ip)))
            return 2;
        return 0;
    }

    /**
     * ip 转 整数
     * @param ipStr
     * @return
     */
    public long ip2Long(String ipStr){
        String[] ipsegs = ipStr.split("\\.");
        long res = Long.parseLong(ipsegs[0]);
        for(int i=1;i<ipsegs.length;i++){
            res = res<<8;
            res += Long.parseLong(ipsegs[i]);
        }
        return res;
    }

    /**
     * 判断ip是否合法
     * @param IP
     * @return
     */
    private boolean isIPv4(String IP){
        String[] ips = IP.split("\\.");
        if (ips.length!=4) return false;
        for (int i = 0; i < ips.length; i++) {
            if (!helIPv4(ips[i])) return false;
        }
        return true;
    }

    /**
     * 判断ip段是否合法
     * @param ipSeg
     * @return
     */
    public boolean helIPv4(String ipSeg){
        if (ipSeg==null||ipSeg.length()>3||ipSeg.charAt(0)=='0'){
            return false;
        }
        for (int i = 0; i < ipSeg.length(); i++) {
            char c = ipSeg.charAt(i);
            if (c>'9' || c<'0'){
                return false;
            }
        }
        if (Integer.parseInt(ipSeg)>255 || Integer.parseInt(ipSeg)<=0) return false;
        return true;
    }
}
