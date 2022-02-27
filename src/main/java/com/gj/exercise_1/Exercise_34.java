package com.gj.exercise_1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
 *
 * 输入 "google"
 *
 * 输出 4
 *
 *
 * 解题思路
 *  链接：https://www.nowcoder.com/questionTerminal/1c82e8cf713b4bbeb2a5b31cf5b0417c
 * 来源：牛客网
 *
 * 说一下解题思路哈，其实主要还是hash，利用每个字母的ASCII码作hash来作为数组的index。
 * 首先用一个58长度的数组来存储每个字母出现的次数，为什么是58呢，主要是由于A-Z对应的ASCII码为65-90，
 * a-z对应的ASCII码值为97-122，而每个字母的index=int(word)-65，比如g=103-65=38，
 * 而数组中具体记录的内容是该字母出现的次数，最终遍历一遍字符串，找出第一个数组内容为1的字母就可以了，时间复杂度为O(n)
 *
 */
public class Exercise_34 {

    public static void main(String[] args) {
        String str = "gGoogle";
        System.out.println(FirstNotRepeatingChar(str));

    }

//    public static int FirstNotRepeatingChar(String str) {
//        if (str==null || str.equals("")){
//            return -1;
//        }
//
//        char []array = str.toCharArray();
//
//        HashMap<Character,Integer>  hashMap = new HashMap<>();
//        for (int i = 0; i < array.length; i++) {
//            if (hashMap.containsKey(array[i])){
//                int count = hashMap.get(array[i]);
//                hashMap.put(array[i],count+1);
//            }else {
//                hashMap.put(array[i],1);
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            if (hashMap.get(array[i])==1){
//                return i;
//            }
//        }
//
//        return -1;
//    }
//

    public static int FirstNotRepeatingChar(String str) {
        if (str==null || str.length()==0){
            return -1;
        }

        char [] charIndexArr = new char[58];
        char [] charStr = str.toCharArray();
        for (int i = 0; i < charStr.length; i++) {
            charIndexArr[(int)charStr[i] - 65] += 1;
        }

        for (int i = 0; i < charStr.length; i++) {
            if (charIndexArr[(int)charStr[i] - 65]==1){
                return i;
            }
        }

        return -1;
    }



//    public int FirstNotRepeatingChar(String str) {
//        if(str==null||str.length()==0) return -1;
//        int []index = new int[(int)'z'+1];
//        char []strChar = str.toCharArray();
//        for(int i=0;i<strChar.length;i++){
//            index[(int)strChar[i]] +=1;
//        }
//        for(int i=0;i<strChar.length;i++){
//            if(index[(int)strChar[i]]==1){
//                return i;
//            }
//        }
//
//        return 0;
//    }




}
