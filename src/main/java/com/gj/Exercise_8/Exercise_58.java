package com.gj.Exercise_8;

import java.util.ArrayList;

public class Exercise_58 {
    public ArrayList<String> restoreIpAddresses (String s) {
        // write code here
        ArrayList<String> res = new ArrayList<>();
        backracking(s,0,new ArrayList<>(),res);
        return res;
    }

    public void backracking(String s,int start,ArrayList<String>ips,ArrayList<String> res){
        if (ips.size()==4 && start==s.length()){
            res.add(ips.get(0)+"."+ips.get(1)+"."+ips.get(2)+"."+ips.get(3));
            return;
        }
        if (s.length()-start>3*(4-ips.size())) return;
        if (s.length()-start<4-ips.size()) return;
        int num = 0;
        for (int i = start; i < start+3 && i<s.length(); i++) {
            num = num*10 + s.charAt(i)-'0';
            if (num<0 || num>255) continue;
            ips.add(s.substring(start,i+1));
            backracking(s,i+1,ips,res);
            ips.remove(ips.size()-1);
            if (num==0) break;
        }
    }

}
