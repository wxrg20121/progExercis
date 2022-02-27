package com.gj.exercise_1;

/**
 * 题目描述
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 * 输入
 * [3,4,5,1,2]
 * 返回值
 * jiayang815666
 * 1
 *
 */

public class Exercise_6 {

    public int minNumberInRotateArray(int [] array) {
        if (array.length==0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        while (left<right){
            if (array[left]<=array[left+1]){
                left++;
            }else {
                return array[left+1];
            }

            if (array[right]>=array[right-1]){
                right --;
            }else {
                return array[right];
            }
        }
        return 0;
    }

}
