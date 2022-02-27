package com.gj2.exercise_2;

import java.util.HashMap;

public class Exercise_7 {
    public int maxLength (int[] arr) {
        // write code here
        HashMap<Integer,Integer>map = new HashMap<>();
        int res = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,map.containsKey(arr[i])?map.get(arr[i]):0);
            res = Math.max(res,i-start+1);
            map.put(arr[i],i+1);
        }
        return res;
    }
}
