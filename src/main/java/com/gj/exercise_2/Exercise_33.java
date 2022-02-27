package com.gj.exercise_2;

/**
 *
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *
 */

public class Exercise_33 {
    public int GetUglyNumber_Solution(int index) {
        if (index<=0) return 0;
        int []array = new int[index];
        array[0] = 1;
        int p_2 = 0;
        int p_3 = 0;
        int p_5 = 0;
        for (int i = 1; i < array.length; i++) {
            array[i] = Math.min(array[p_2]*2, Math.min(array[p_3]*3, array[p_5]*5));
            if (array[i]==array[p_2]*2) p_2++;
            if (array[i]==array[p_3]*3) p_3++;
            if (array[i]==array[p_5]*5) p_5++;
        }
        return array[index-1];
    }
}

