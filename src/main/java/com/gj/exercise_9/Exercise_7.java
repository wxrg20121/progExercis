package com.gj.exercise_9;

import java.util.HashMap;

public class Exercise_7 {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        HashMap<Integer,Integer>map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target-numbers[i])){
                res[0] = map.get(target-numbers[i]);
                res[1] = i+1;
                return res;
            }
            map.put(numbers[i],i+1);
        }
        return res;
    }
}
