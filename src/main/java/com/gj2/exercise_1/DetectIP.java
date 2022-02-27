package com.gj2.exercise_1;

/**
 * 第一种方案：生成一个bitmap，把ip四段、位置、白名单和黑名单信息进行编码生成新数字进行存储（已实现）
 * 第二种方案：生成8个bitmap，对ip四段、位置、白黑名单进行拆分
 * 第三种方案：生成一个bitmap，但要在最后加入8byte的存储空间，用于记录位置和白黑名单 （目前想到的最优方案，还未实现）
 *
 *
 * 面试官你好啊，我仔细想了想，我之前没想明白。
 * 1.ip的四段都是0~255的值，如果bitmap里面存储了0~255的值，一段ip在bitmap有256中取值，四段ip就是256*256*256*256=2^32。就是四次独立从bitmap中随机取数，就能有2^32取数可能。
 * 2.用2560的bitmap，则有2560*2560*2560*2560*中取数可能，这种空间还是占比多了。
 *
 * 3.目前想到的最优思路是，0~255(0-32个 8bit)表示每一段ipseg，再加8bit，就是第33层，可以用来表示ip的第几段和黑白名单信息，第33层8bit对应的整值分别为：256、257、258、259、260、261、262、263。则可以用256~259表示白名单ip的第一第二第三第四段，260、261、262、263表示黑名单ip的第一第二第三第四段。
 * 4.利用上述(3)，存储ip：
 */
public class DetectIP {
    //获取bitmap操作对象
    public static Bitmap bitmap=new Bitmap(2560);

    public static void main(String[] args) {
        String ip1 = "255.255.255.255";
        String ip2 = "172.16.254.2";
        String ip3 = "172.16.253.1";
        String ip4 = "172.18.254.1";
        String ip5 = "1.1.1.1";
        String ip6 = "1.10.1.1";

        SetIpInList(ip1,1);
        SetIpInList(ip2,2);
        SetIpInList(ip3,1);
        SetIpInList(ip4,1);
        SetIpInList(ip5,2);
        System.out.println(IsInList(ip1));
        System.out.println(IsInList(ip2));
        System.out.println(IsInList(ip3));
        System.out.println(IsInList(ip4));
        System.out.println(IsInList(ip5));
        System.out.println(IsInList(ip6));
    }


    /**
     *设置指定的ipv4地址进入名单
     * @param ip(以*.*.*.*格式的ipv4字符串)
     * @param ipType(1白名单，2黑名单)
     *
     */
    public static void SetIpInList(String ip,int ipType){
        if (isIPv4(ip)){
            String[] ipSegs = ip.split("\\.");
            for (int i = 0; i < ipSegs.length; i++) {
                String ipSeg = ip2SetType(ipSegs[i],i,ipType);
                bitmap.add(Integer.parseInt(ipSeg));
            }
        }
    }

    /**
     * 判断指定的ipv4地址是否在当前名单中
     *
     * @param ip(以*.*.*.*格式的ipv4字符串)
     * @return 1：在白名单中， 2: 在黑名单中， 0: 不在名单中
     */
    public static int IsInList(String ip){
        if (!isIPv4(ip)) return 0;
        String[] ipSegs = ip.split("\\.");
        if (isIpWhiteList(ipSegs)) return 1;
        if (isIpBlackList(ipSegs)) return 2;
        return 0;
    }

    public static boolean isIpWhiteList(String[] ipSegs){
        for (int i = 0; i < ipSegs.length; i++) {
            String ipSeg = ip2SetType(ipSegs[i],i,1);
            if (!bitmap.get(Integer.parseInt(ipSeg))) return false;
        }
        return true;
    }

    public static boolean isIpBlackList(String[] ipSegs){
        for (int i = 0; i < ipSegs.length; i++) {
            String ipSeg = ip2SetType(ipSegs[i],i,2);
            if (!bitmap.get(Integer.parseInt(ipSeg))) return false;
        }
        return true;
    }

    /**

     * @param ipSeg ip段，eg：10.15.1.21 中的21
     * @param index
     * @param ipType
     * *把ip段转换为存储ip段，eg：ip2SetType("21",3,1)中的21 转换为217。转换规则如下
     *       1. ipseg在白名单ip中的分段位置0、1、2、3对应值1、3、5、7，把生成的值放在ipseg的后面
     *       2.ipseg在白名单ip中的分段位置0、1、2、3对应值2、4、6、8，把生成的值放在ipseg的后面
     */
    private static String ip2SetType(String ipSeg,int index,int ipType){

        if (ipType==1){
            index = 2*index+1;
        }else if (ipType==2){
            index = 2*index+2;
        }
        return ipSeg+index;
    }

    /**
     * 判断ip是否合法
     * @param IP
     * @return
     */
    private static boolean isIPv4(String IP){
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
    public static boolean helIPv4(String ipSeg){
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
