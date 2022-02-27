package com.gj.exercise_2;


import java.util.*;

public class Exercise_67 {

    //
    /**
     *
     * 求解数组最长公共子序列LCS（动态规划法）
     * 1.定义
     *
     * 最长公共子序列LCS（Longest Common Subsequence）：一个数列 ，如果分别是两个或多个已知数列的子序列，且是所有符合此条件序列中最长的，则 称为已知序列的最长公共子序列。
     *
     * 如：str1=“hfauag”,str2="afhuawg",最长公共子序列为：“huag”
     *
     * 2.应用
     *
     * 判断两段文字的相似性，用于判别文章是否抄袭。
     *
     * 3.算法原理和步骤：
     *
     * 假设两个序列：x={x1,...,xm}，y={y1,...,yn}  的最长公共子序列为  z={z1,z2,...,zk}
     *
     * ① 若xm=yn，则zk=xm=yn，因此：{x1,...,xm-1}，{y1,...,yn-1}的最长公共子序列为 {z1,...,zk-1}
     *
     * ② 若xm!=yn，则若xm!=zk，意味着：{x1,...,xm-1}，{y1,...,yn}的最长公共子序列为 {z1,...,zk}
     *
     *      即：求{x1,...,xm}，{y1,...,yn}  的LCS等同于：求{x1,...,xm-1}，{y1,...,yn}的LCS
     *
     * ③ 若xm!=yn，则若ym!=zk，意味着：{x1,...,xm}，{y1,...,yn-1}的最长公共子序列为 {z1,...,zk}
     *
     *      即：求{x1,...,xm}，{y1,...,yn}  的LCS等同于：求{x1,...,xm}，{y1,...,yn-1}的LCS
     * ————————————————
     * 版权声明：本文为CSDN博主「jiao_yu」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
     * 原文链接：https://blog.csdn.net/jiao_yu/article/details/53925499
     */

    public static void main(String[] args) {
        String x = "hfauag"; //AGGTAB
        String y = "afhuawg"; //GXTXAYB
//        System.out.println(lcs(x.toCharArray(),y.toCharArray(),x.length(),y.length()));
        getLCS(x,y);
//        lcs(x,y);
        System.out.println(rand7());
    }

    public static String getLCS(String x,String y){

        char[] s1 = x.toCharArray();
        char[] s2 = y.toCharArray();

        int[][] array = new int[s1.length+1][s2.length+1];

        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (s1[i-1]==s2[j-1]){
                    array[i][j] = array[i-1][j-1]+1;
                }else {
                    array[i][j] = Math.max(array[i-1][j],array[i][j-1]);
                }
            }
        }


        Stack<Character>stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        int i = s1.length;
        int j = s2.length;

        while (i>=1 && j>=1){
            if (s1[i-1]==s2[j-1]){
                stack.push(s1[i-1]);
                sb.append(s1[i-1]);
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

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        return array[s1.length][s2.length]==0 ? "-1" : sb.reverse().toString();

    }


//    public static int lcs(char[] X, char[] Y, int m, int n){
//        if (m==0||n==0){
//            return 0;
//        }
//        if (X[m-1]==Y[n-1]){
//            return lcs(X,Y,m-1,n-1)+1;
//        }else {
//            return Math.max(lcs(X,Y,m-1,n),lcs(X,Y,m,n-1));
//        }
//    }

    public static void lcs(String x, String y){
        char[] s1 = x.toCharArray();
        char[] s2 = y.toCharArray();

        int[][] array = new int[s1.length+1][s2.length];
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[0].length; j++) {
                if (s1[i-1]==s2[j-1]){
                    array[i][j] = array[i-1][j-1] + 1;
                }else {
                    array[i][j] = Math.max(array[i-1][j],array[i][j-1]);
                }
            }

        }

        Stack<Character>stack = new Stack<>();
        int i = s1.length;
        int j = s2.length;
        while (i>=1 && j>=1){
            if (s1[i-1]==s2[j-1]){
                stack.push(s1[i-1]);
                i--;
                j--;
            }else {
                if (array[i-1][j]>array[i][j-1]){
                    i--;
                }else {
                    j--;
                }
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    public static Random random = new Random();

    public static int rand5(){
        return random.nextInt(5)+1;
    }

    public static int rand7(){
        int x = 22;
        while (x>21){
            x = rand5() + (rand5()-1) * 5;
        }
        return x%7 + 1;
    }



}
