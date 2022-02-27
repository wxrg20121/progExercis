package com.gj.exercise_1;

/**
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则返回true,否则返回false。假设输入的数组的任意两个数字都互不相同。
 * 输入 [4,8,6,12,16,14,10]
 * 输出 true
 */
public class Exercise_23 {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0) return false;
        return judge(sequence,0,sequence.length-1);
    }


    public static boolean judge(int [] sequence,int left, int right){

        if (left>=right){
            return true;
        }
        int i = right;
        while (i>left && sequence[i-1]>sequence[right]) {
            i --;
        }
        for (int j = left; j <= i-1; j++) {
            if (sequence[j]>sequence[right]){
                    return false;
            }
        }
        return judge(sequence,left,i-1) && judge(sequence,i,right-1);
    }

//    private boolean judge(int []sequence,int left,int right){
//        if(left >= right){
//            return true;
//        }
//        int i = right;
//        while(i>left&&sequence[i-1]>sequence[right]) --i;
//        for(int j=left;j<=i-1;j++){
//            if(sequence[j]>sequence[right]) return false;
//        }
//        return judge(sequence,left,i-1)&&judge(sequence,i,right-1);
//    }
}
