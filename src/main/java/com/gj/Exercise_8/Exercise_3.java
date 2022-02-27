package com.gj.Exercise_8;

import java.util.HashMap;
import java.util.Map;

public class Exercise_3 {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        Map<Integer,Integer>map = new HashMap<>();
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
