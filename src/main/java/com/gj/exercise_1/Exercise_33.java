package com.gj.exercise_1;

/**
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。例如6、8都是丑数，但14不是，因为它包含质因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *
 *
 * 输入 7
 * 输出 8
 *
 */
public class Exercise_33 {

    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }


    public static int GetUglyNumber_Solution(int index) {
        if(index<=0) return 0;
        int []array = new int[index];
        array[0] = 1;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        for (int i = 1; i < index; i++) {
            array[i] = Math.min(array[t2]*2,Math.min(array[t3]*3,array[t5]*5));
            if (array[i]==array[t2]*2) t2++;
            if (array[i]==array[t3]*3) t3++;
            if (array[i]==array[t5]*5) t5++;
        }

        return array[index-1];
    }

//    public static int GetUglyNumber_Solution(int index) {
//        if (index<=0){
//            return 0;
//        }
//        int i = 1;
//        int cnt = 0;
//        while (cnt!=index){
//            if (isIuly(i)){
//                cnt++;
//            }
//            i++;
//        }
//        return i-1;
//    }
//
//    public static boolean isIuly(int index){
//        if (index==1){
//            return true;
//        }
//
//        if (index%2!=0 && index%3!=0 && index%5!=0){
//            return false;
//        }
//
//        if (index%2==0){
//            return isIuly(index/2);
//        }else if (index%3==0){
//            return isIuly(index/3);
//        }else if (index%5==0){
//            return isIuly(index/5);
//        }
//
//        return false;
//    }

}
