package com.gj2.exercise_1;
import java.util.*;

public class Exercise_3 {
    public ArrayList<String> restoreIpAddresses (String s) {
        // write code here

        ArrayList<String>arrayList = new ArrayList<>();
        if (s.length()==0) return arrayList;
        dfs(s,"",0,arrayList);
        return arrayList;
    }

    public void dfs(String ipSeg,String res,int count,ArrayList<String>arrayList){
        if (count==3 && isIpv4Seg(ipSeg)){
            arrayList.add(res+ipSeg);
        }
        for (int i = 1; i < 4&&i<ipSeg.length(); i++) {
            String ipseg = ipSeg.substring(0,i);
            if (isIpv4Seg(ipseg)){
                dfs(ipSeg.substring(i),res+ipseg+".",count+1,arrayList);
            }
        }

    }

    public boolean isIpv4Seg(String ipseg){
        if (ipseg.length()==0 || ipseg.length()>3) return false;
        for (int i = 0; i < ipseg.length(); i++) {
            char c = ipseg.charAt(i);
            if (c<'0' || c>'9') return false;
        }
        if ((ipseg.charAt(0)=='0' && ipseg.length()>1) || Integer.parseInt(ipseg)<0 || Integer.parseInt(ipseg)>255) return false;
        return true;
    }
}
