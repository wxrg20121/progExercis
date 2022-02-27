package com.gj.exercise_2;

import java.util.ArrayList;

/**
 *
 * 小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 * 没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 */

public class Exercise_41 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {

        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<ArrayList<Integer>>();
        if (sum<2){
            return arrayList;
        }
        int left = 1;
        int right = 2;
        while (left<right){
            int sum_2 = (right+left)*(right-left+1)/2;
            if (sum_2==sum){
                ArrayList<Integer>arrayList1 = new ArrayList<>();
                for (int i = left; i <= right; i++) {
                    arrayList1.add(i);
                }
                left++;
                arrayList.add(arrayList1);
            }else if (sum_2<sum){
                right++;
            }else {
                left++;
            }
        }

        return arrayList;

    }
}
