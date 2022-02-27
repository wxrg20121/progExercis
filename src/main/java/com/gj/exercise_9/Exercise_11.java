package com.gj.exercise_9;

import java.util.HashMap;

public class Exercise_11 {
    public int maxLength (int[] arr) {
        // write code here
        int start = 0;
        int res = 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,map.containsKey(arr[i])?map.get(arr[i]):0);
            res = Math.max(res,i-start+1);
            map.put(arr[i],i+1);
        }
        return res;
    }
}
