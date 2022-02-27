package com.gj.exercise_5;

import java.util.HashMap;
import java.util.Iterator;

public class Exercise_8 {
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target-numbers[i])){
                return new int[]{map.get(target-numbers[i]),i+1};
            }else {
                map.put(numbers[i],i+1);
            }
        }
        return new int[]{-1,-1};

    }
}
