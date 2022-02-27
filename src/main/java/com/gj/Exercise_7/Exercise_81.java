package com.gj.Exercise_7;

public class Exercise_81 {
    public String solve (String IP) {
        // write code here
        if (!(IP.contains(".")||IP.contains(":"))) return "Neither";
        if (isIPv4(IP)) return "IPv4";
        if (isIPv6(IP)) return "IPv6";
        return "Neither";
    }

    public boolean isIPv4(String IP){
        String[] ips = IP.split("\\.");
        if (ips.length!=4) return false;
        for (int i = 0; i < ips.length; i++) {
            if (!helIPv4(ips[i])){
                return false;
            }
        }
        return true;
    }

    public boolean helIPv4(String ipSeg){
        if (ipSeg==null||ipSeg.length()==0||ipSeg.length()>3 || ipSeg.charAt(0)=='0' || Integer.parseInt(ipSeg)>255 || Integer.parseInt(ipSeg)<=0) return false;
        for (int i = 0; i < ipSeg.length(); i++) {
            if (ipSeg.charAt(i)<'0' || ipSeg.charAt(i)>'9') return false;
        }
        return true;
    }


    public boolean isIPv6(String IP){
        String[] ips = IP.split(":");
        if (ips.length!=8) return false;
        for (int i = 0; i < ips.length; i++) {
            if (!helIPv6(ips[i])) return false;
        }
        return true;
    }

    public boolean helIPv6(String ipSeg){
        if (ipSeg==null||ipSeg.length()==0||ipSeg.length()>4) return false;
        for (int i = 0; i < ipSeg.length(); i++) {
            char c = ipSeg.charAt(i);
            if (!((c>='0'&&c<='9')||(c>='a'&&c<='f')||(c>='A'&&c<='F'))) return false;
        }
        return true;
    }

}
