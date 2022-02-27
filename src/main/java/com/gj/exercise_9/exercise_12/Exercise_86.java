package com.gj.exercise_9.exercise_12;

import java.util.ArrayList;

public class Exercise_86 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(findAnagrams2(s,t));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public ArrayList<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (s.length()<p.length()){
            return arrayList;
        }
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int[] hash = new int[26];
        for (int i = 0; i < pArr.length; i++) {
            hash[pArr[i]-'a']++;
        }
        int l=0, count=0, plen=pArr.length;
        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]-'a']--;
            if (hash[sArr[r]-'a']>=0){
                count++;
            }
            if (r>plen-1){
                hash[sArr[l]-'a']++;
                if (hash[sArr[l]-'a']>0){
                    count--;
                }
                l++;
            }
            if (count==plen){
                arrayList.add(l);
            }
        }
        return arrayList;
    }

    public static String findAnagrams2(String s, String t) {
        if (s.length()<t.length()){
            return "";
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] hash = new int[256];
        for (int i = 0; i < tArr.length; i++) {
            hash[tArr[i]] ++;
        }
        int l=0, count=tArr.length, max=sArr.length+1;
        String res = "";
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

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        char[] sArr = s.toCharArray();
        int[] hash = new int[256];

        int l = 0, result = 1;
        for (int r = 0; r < sArr.length; ++r) {
            hash[sArr[r]]++;

            while (hash[sArr[r]] != 1) {
                hash[sArr[l]]--;
                l++;
            }

            result = Math.max(result, r - l + 1);
        }
        return result;
    }
}
