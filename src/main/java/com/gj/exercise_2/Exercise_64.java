package com.gj.exercise_2;

/**
 *
 *
 * 题解
 *
 * 基本思想：
 * 0.根据给定数组，初始化一个标志位数组，初始化为false，表示未走过，true表示已经走过，不能走第二次
 * 1.根据行数和列数，遍历数组，先找到一个与str字符串的第一个元素相匹配的矩阵元素，进入judge
 *
 * 2.根据i和j先确定一维数组的位置，因为给定的matrix是一个一维数组
 *
 * 3.确定递归终止条件：(1)越界，(2)当前找到的矩阵值不等于数组对应位置的值，(3)已经走过的，这三类情况，都直接false，说明这条路不通
 *
 * 4.若k，就是待判定的字符串str的索引已经判断到了最后一位，此时说明是匹配成功的
 *
 * 5.下面就是本题的精髓，递归不断地寻找周围四个格子是否符合条件，只要有一个格子符合条件，就继续再找这个符合条件的格子的四周是否存在符合条件的格子，直到k到达末尾或者不满足递归条件就停止。
 *
 * 6.走到这一步，说明本次是不成功的，我们要还原一下标志位数组index处的标志位，进入下一轮的判断。
 *
 */

public class Exercise_64 {
//    public boolean hasPath (String matrix, int rows, int cols, String str) {
//        // write code here
//        boolean[] visited = new boolean[rows*cols];
//        char[] maxtrixs = matrix.toCharArray();
//        char[] strs =str.toCharArray();
//        //遍历寻找最开始的一个匹配
//        for(int i = 0;i < rows;i++){
//            for(int j = 0;j < cols; j++){
//                if(judge(maxtrixs,strs,visited,rows,cols,i,j,0)) return true;
//            }
//        }
//        return false;
//    }
//
//
//    //k代表当已经匹配到几个了
//    public boolean judge(char[] matrixs,char[] strs,boolean[] visited,int rows,int cols,int i,int j,int k){
//        int is_visited_pos = i * cols + j;//计算将要访问的字母的下标
//        if(i<0||i>=rows||j<0||j>=cols||visited[is_visited_pos]==true||matrixs[is_visited_pos]!=strs[k]){
//            return false;
//        }
//        //如果第k个满足上面的条件，并且k等于要匹配的长度
//        if(k==strs.length-1) return true;
//        //如果符合以上的条件即把当前位置标记为已经访问
//        visited[is_visited_pos] = true;
//        //上下左右搜寻
//        if(judge(matrixs,strs,visited,rows,cols,i-1,j,k+1)||
//                judge(matrixs,strs,visited,rows,cols,i+1,j,k+1)||
//                judge(matrixs,strs,visited,rows,cols,i,j-1,k+1)||
//                judge(matrixs,strs,visited,rows,cols,i,j+1,k+1)
//                )return true;//通过is_visited_pos寻找到了
//        //如果没有通过is_visited_pos寻找到，说明is_visited_pos不通，将其重新置为没有访问
//        visited[is_visited_pos] = false;
//        return false;
//    }

    public boolean hasPath (String matrix, int rows, int cols, String str) {
        // write code here
        boolean[] visited = new boolean[rows*cols];
        char[] matrixs = matrix.toCharArray();
        char[] strs = str.toCharArray();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (judge(matrixs, strs, visited, rows, cols, i, j, 0))return true;
            }
        }
        return false;
    }

    public boolean judge(char[] matrixs,char[] strs,boolean[] visited,int rows, int cols, int i, int j,int k){
        int is_visited_pos = i * cols + j;
        if (i<0||i>=rows||j<0||j>=cols||visited[is_visited_pos]==true||matrixs[is_visited_pos]!=strs[k]){
            return false;
        }
        if (k==strs.length-1){
            return true;
        }
        visited[is_visited_pos]=true;

        if (judge(matrixs, strs, visited, rows, cols, i-1, j, k+1)||
                judge(matrixs, strs, visited, rows, cols, i+1, j, k+1)||
                judge(matrixs, strs, visited, rows, cols, i, j+1, k+1)||
                judge(matrixs, strs, visited, rows, cols, i, j-1, k+1))
            return true;

        visited[is_visited_pos]=false;
        return false;
    }

}
