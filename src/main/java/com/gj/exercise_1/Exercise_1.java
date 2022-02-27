package com.gj.exercise_1;

/*
在一个二维数组中（每个一维数组的长度相同），
每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

输入
 7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
返回值
true

 */
public class Exercise_1 {

    public static void main(String[] args) {
        int[][] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(Find(0,array));
    }

    public static boolean Find(int target,int[][] array){
        int m = array.length;
        int n = array[0].length;
        if (m==0 || n==0){
            return false;
        }
        if (target>array[m-1][n-1] || target<array[0][0]){
            return false;
        }
        int i=m-1,j=0;
        while (i>=0 && j<=n-1){
            if (target==array[i][j]){
                return true;
            }
            if (target>array[i][j]){
                j++;
            }
            if (target<array[i][j]){
                i--;
            }
        }
        return false;
    }
}
