package com.gj.exercise_9.exercise_12;

public class Exercise_107 {
    public static void main(String[] args) {
        System.out.println(5%6);
    }
    public int[] FindNumsAppearOnce (int[] array) {

        if (array.length<2){
            return null;
        }
        int[] res = new int[2];
        int num = array[0];
        for (int i = 1; i < array.length; i++) {
            num ^= array[i];
        }
        int index = 0;
        while ((num&1)==0){
            index++;
            num>>=1;
        }
        for (int i = 0; i < array.length; i++) {
            if (((array[i]>>index)&1)==1){
                res[0]^=array[i];
            }else {
                res[1]^=array[i];
            }
        }
        if (res[0]>res[1]){
            res[0]=res[0]+res[1];
            res[1]=res[0]-res[1];
            res[0] =res[0]-res[1];
        }
        return res;
    }
}
