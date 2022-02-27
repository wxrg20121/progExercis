package com.gj.exercise_3;

import javax.sound.midi.Soundbank;
import java.util.Stack;

public class Exercise_17 {
    public static void main(String[] args) {
        System.out.println(fun(3,3));

        String str1 = "hfauag";
        String str2 = "afhuawg";
        System.out.println(LCS(str1,str2));

    }
//    public static int fun(int m,int n){
//        int [][]array = new int[m][n];
//        for (int i = 0; i < m; i++) {
//            array[i][0] = 1;
//        }
//        for (int j = 0; j < n; j++) {
//            array[0][j] = 1;
//        }
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                array[i][j] = array[i-1][j] + array[i][j-1];
//            }
//        }
//        return array[m-1][n-1];
//    }
//
//    public static String LCS(String str1,String str2){
//        char[] char1 = str1.toCharArray();
//        char[] char2 = str2.toCharArray();
//        int [][] array = new int[char1.length+1][char2.length+1];
//        for (int i = 0; i <= char1.length; i++) {
//            array[i][0] = 0;
//        }
//        for (int j = 0; j <= char2.length; j++) {
//            array[0][j] = 0;
//        }
//        for (int i = 1; i <= char1.length; i++) {
//            for (int j = 1; j <= char2.length; j++) {
//                if (char1[i-1]==char2[j-1]){
//                    array[i][j] = array[i-1][j-1] + 1;
//                }else {
//                    array[i][j] = Math.max(array[i][j-1],array[i-1][j]);
//                }
//            }
//        }
//        Stack<Character> stack = new Stack<>();
//        int i = char1.length;
//        int j = char2.length;
//        while (i>=1 && j>=1){
//            if (char1[i-1]==char2[j-1]){
//                stack.push(char1[i-1]);
//                i--;
//                j--;
//            }else {
//                if (array[i][j-1]>array[i-1][j]){
//                    j--;
//                }else {
//                    i--;
//                }
//            }
//        }
//        StringBuffer sb = new StringBuffer();
//        while (!stack.isEmpty()){
//            sb.append(stack.pop());
//        }
//
//        return sb.toString();
//    }

    public static int fun(int m,int n){
        int[][] array = new int[m][n];
        array[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j==0 && i>=1){
                    array[i][j] = array[i-1][j];
                }
                if (i==0 && j>=1){
                    array[i][j] = array[i][j-1];
                }
                if (i>=1 && j>=1){
                    array[i][j] = array[i-1][j] + array[i][j-1];
                }
            }
        }
        return array[m-1][n-1];
    }

    public static String LCS(String s1,String s2){

        char []c1 = s1.toCharArray();
        char []c2 = s2.toCharArray();
        int [][]array = new int[c1.length+1][c2.length+1];
        for (int i = 0; i <= c1.length; i++) {
            array[i][0] = 0;
        }
        for (int j = 0; j <= c2.length; j++) {
            array[0][j] = 0;
        }

        for (int i = 1; i <= c1.length; i++) {
            for (int j = 1; j <=c2.length ; j++) {
                if (c1[i-1]==c2[j-1]){
                    array[i][j] = array[i-1][j-1] + 1;
                }else {
                    array[i][j] = Math.max(array[i-1][j],array[i][j-1]);
                }
            }
        }

        Stack<Character> stack = new Stack<>();
        int i=c1.length;
        int j=c2.length;
        while (i>=1 && j>=1){
            if (c1[i-1]==c2[j-1]){
                stack.push(c1[i-1]);
                i--;
                j--;
            }else {
                if (array[i][j-1]>array[i-1][j]){
                    j--;
                }else {
                    i--;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }


        return sb.toString();
    }

}
