package com.gj.exercise_2;

/**
 *
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
 *
 */

public class Exercise_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length==0){
            return false;
        }
        return hel(sequence,0,sequence.length-1);
    }

    public boolean hel(int []sequence,int left,int right){
        if (left>=right){
            return true;
        }
        int i = right;
        while (i>left && sequence[i-1]>sequence[right]){
            i--;
        }

        for (int j = left; j < i; j++) {
            if (sequence[j]>sequence[right]){
                return false;
            }
        }
        return hel(sequence,left,i-1) && hel(sequence,i,right-1);
    }
}
