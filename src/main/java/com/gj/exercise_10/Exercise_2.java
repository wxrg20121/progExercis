package com.gj.exercise_10;

import java.util.HashMap;
import java.util.Map;

public class Exercise_2 {
    public int maxLength (int[] arr) {
        Map<Integer,Integer>map = new HashMap<>();
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
