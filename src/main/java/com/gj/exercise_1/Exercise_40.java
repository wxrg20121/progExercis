package com.gj.exercise_1;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 *
 */
public class Exercise_40 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if (array.length==2){
            num1[0] = array[0];
            num2[0] = array[1];
        }

        int bitResult = 0;
        for (int i = 0; i < array.length; i++) {
            bitResult ^= array[i];
        }

        int index = findFirstIndex(bitResult);
        num1[0] = 0;
        num2[0] = 0;

        for (int i = 0; i < array.length; i++) {
            if (isBit1(array[i],index)){
                num1[0] ^= array[i];
            }else {
                num2[0] ^= array[i];
            }
        }
    }

    public static int findFirstIndex(int bitResult){

        int index = 0;
        while ((bitResult & 1)==0 && index<32){
            bitResult >>= 1;
            index++;
        }

        return index;
    }

    public static boolean isBit1(int val,int index){
        if (((val >> index) & 1)==1){
            return true;
        }
        return false;
    }
}
