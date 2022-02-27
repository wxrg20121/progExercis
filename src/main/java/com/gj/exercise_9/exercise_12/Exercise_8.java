package com.gj.exercise_9.exercise_12;

import java.util.HashMap;

public class Exercise_8 {
    public int[] twoSum (int[] numbers, int target) {
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
