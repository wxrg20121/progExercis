package com.gj.exercise_5;

import java.util.ArrayList;

public class Exercise_93 {

    public static void main(String[] args) {
        String s = "abababab";
        String p = "ababab";
//        ArrayList<Integer> res = findAnagrams(s,p);
//        for (int i = 0; i < res.size(); i++) {
//            System.out.println(res.get(i));
//        }
        System.out.println(kmp("ababab","abababab"));
    }

    public static ArrayList<Integer>findAnagrams(String s,String p){
        //输入有效性判断
        ArrayList<Integer>arrayList = new ArrayList<>();
        if (s.length()<p.length()) return arrayList;
        char[] sArr = s.toCharArray();
        char[] pArr = p.toCharArray();
        int[] hash = new int[26];

        for (int i = 0; i < pArr.length; i++) {
            hash[sArr[i]-'a']++;
        }
        int l=0,count=0,plen = pArr.length;

        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]-'a']--;
            if (hash[sArr[r]-'a']>=0){
                count++;
            }
            if (r-l+1>plen){
                hash[sArr[l]-'a']++;
                if (hash[sArr[l]-'a']>0){
                    count--;
                }
            }
            if (count==plen){
                arrayList.add(l);
            }
        }
        return arrayList;

    }

    public static String findAnagrams2(String s,String t){
        //输入有效性判断
        if (s.length()<t.length()) return "";
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        int[] hash = new int[256];
        String res="";

        for (int i = 0; i < tArr.length; i++) {
            hash[tArr[i]]++;
        }
        int l=0, count=tArr.length,max = s.length()+1;
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
                max=r-l+1;
                res = s.substring(l,r+1);
            }


        }
        return res;
    }

    public static int kmp (String S, String T) {
        // write code here
        if (T.length()<S.length()) return 0;
        char[] tArr = T.toCharArray();
        char[] sArr = S.toCharArray();

        int[] hash = new int[256];
        for (int i = 0; i < sArr.length; i++) {
            hash[sArr[i]]++;
        }
        int l=0, count=0, res=0, slen=sArr.length;
        for (int r = 0; r < tArr.length; r++) {
            hash[tArr[r]]--;
            if (hash[tArr[r]]>=0){
                count++;
            }
            if (r>=slen){
                hash[tArr[l]]++;
                if (hash[tArr[l]]>0){
                    count--;
                }
                l++;
            }

            if (count==slen && T.substring(l,r+1).equals(S)){
                res++;
            }
        }
        return res;

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s==null || s.length()==0){
            return 0;
        }
        char[] sArr = s.toCharArray();
        int[] hash = new int[sArr.length];
        int l = 0, res = 1;
        for (int r = 0; r < sArr.length; r++) {
            hash[sArr[r]]++;
            while (l<r && hash[sArr[r]]!=1){
                hash[sArr[l]]--;
                l++;
            }
            res = Math.max(res,r-l+1);
        }
        return res;

    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s2.length()<s1.length()) return false;
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        int[] hash = new int[26];
        for (int i = 0; i < s1Arr.length; i++) {
            hash[s1Arr[i]-'a']++;
        }
        int l=0, count=0;
        for (int r = 0; r < s2Arr.length; r++) {
            hash[s2Arr[r]-'a']--;
            if (hash[s2Arr[r]-'a']>=0){
                count++;
            }
            if (r>=s1.length()){
                hash[s2Arr[l]-'a']++;
                if (hash[s2Arr[l]-'a']>0){
                    count--;
                }
                l++;
            }
            if (count==s1.length()){
                return true;
            }
        }
        return false;
    }

}
