package com.gj.exercise_9.exercise_12;

import java.util.HashMap;

public class Exercise_14 {
    public int maxLength (int[] arr) {
        if (arr.length==0) return 0;
        HashMap<Integer,Integer>map = new HashMap<>();
        int start = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start,map.containsKey(arr[i])?map.get(arr[i]):0);
            res = Math.max(res,i-start+1);
            map.put(arr[i],i+1);
        }
        return res;
    }
}
