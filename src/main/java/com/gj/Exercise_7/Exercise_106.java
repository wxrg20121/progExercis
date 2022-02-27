package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_106 {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = findAnagrams("cbaebabacd","abc");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println(minWindow("XDOYEZODEYXNZ", "XYZ"));
    }

    public static ArrayList<Integer>findAnagrams(String s, String p){
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (s.length()<p.length()) return arrayList;

        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();

        int[]hash = new int[26];
        for (int i = 0; i < pArr.length; i++) {
            hash[pArr[i]-'a']++;
        }
        int l=0,count=0,pLen = pArr.length;
        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]-'a']--;
            if (hash[sArr[r]-'a']>=0){
                count++;
            }
            if (r>pLen-1){
                hash[sArr[l]-'a']++;
                if (hash[sArr[l]-'a']>0){
                    count--;
                }
                l++;
            }
            if (count==pLen){
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    public static String minWindow(String s, String t){
        if (s.length()<t.length()){
            return "";
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        int[]hash = new int[256];
        for (int i = 0; i < tArr.length; i++) {
            hash[tArr[i]]++;
        }

        String res = "";
        int l = 0, count=tArr.length,max=sArr.length+1;

        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]]--;
            if (hash[sArr[r]]>=0){
                count--;
            }
            while (l<r && hash[sArr[l]]<0){
                hash[sArr[l]]++;
                l++;
            }
            if (count==0 && max>r-l+1){
                max = r-l+1;
                res = s.substring(l,r+1);
            }
        }
        return res;
    }

}
