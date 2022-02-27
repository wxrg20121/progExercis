package com.gj.exercise_5;

public class Exercise_66 {

    public static void main(String[] args) {
        Exercise_66 exercise_66 = new Exercise_66();
        System.out.println(exercise_66.solve("2001:0db8:85a3:0:0:8A2E:0370:7334"));
    }

    public String solve (String IP) {
        // write code here
        if (!IP.contains(".") && !IP.contains(":")) return "Neither";
        if (isIPv4(IP)) return "IPv4";
        if (isIPv6(IP)) return "IPv6";
        return "Neither";
    }

    public boolean isIPv4(String IP){
        String []ips = IP.split("\\.");
        if (ips.length!=4) return false;
        for (int i = 0; i < ips.length; i++) {

            if (!helIPv4(ips[i])) return false;
        }
        return true;
    }

    public boolean helIPv4(String ipseg){

        if (ipseg==null||ipseg.length()==0||ipseg.length()>3) return false;

        for (int i = 0; i < ipseg.length(); i++) {
            if (ipseg.charAt(i)<'0' || ipseg.charAt(i)>'9') return false;
        }
        if (Integer.parseInt(ipseg)>255 || Integer.parseInt(ipseg)<=0 || ipseg.charAt(0)=='0') return false;
        return true;
    }

    public boolean isIPv6(String IP){
        String []ips = IP.split(":");
        if (ips.length!=8) return false;
        for (int i = 0; i < ips.length; i++) {
            if (!helIPv6(ips[i])) return false;
        }
        return true;
    }

    public boolean helIPv6(String ip){
        if (ip==null || ip.length()==0 || ip.length()>4) return false;
        for (int i = 0; i < ip.length(); i++) {
            char c = ip.charAt(i);
            if (!((c>='0' && c<='9') || (c>='a' && c<='f') || (c>='A' && c<='F'))) return false;
        }
        return true;
    }

}
