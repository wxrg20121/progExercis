package com.gj.exercise_5;

import java.util.*;

public class Exercise_3 {
    public int[] LRU (int[][] operators, int k) {
        // write code here
        Map<Integer,Integer>map = new LinkedHashMap<>();
        List<Integer>list = new LinkedList<>();
        for (int []operator : operators){
            int key = operator[1];
            if (operator[0]==1){
                int val = operator[2];
                if (map.size()<k){
                    map.put(key,val);
                }else {
                    Iterator it = map.keySet().iterator();
                    map.remove(it.next());
                    map.put(key,val);
                }
            }else if (operator[0]==2){
                if (map.containsKey(key)){
                    int val = map.get(key);
                    list.add(val);
                    map.remove(key);
                    map.put(key,val);
                }else {
                    list.add(-1);
                }
            }
        }
        int[]res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;

    }

    public int[] LRU2 (int[][] operators, int k) {
        // write code here
        Map<Integer,Integer>map = new LinkedHashMap<>();
        List<Integer>list = new LinkedList<>();
        for (int []operator : operators) {
            int key = operator[1];

            switch (operator[0]) {
                case 1:
                    int val = operator[2];
                    if (map.size() < k) {
                        map.put(key, val);
                    } else {
                        Iterator it = map.keySet().iterator();
                        map.remove(it.next());
                        map.put(key, val);
                    }
                    break;
                case 2:
                    if (map.containsKey(key)) {
                        val = map.get(key);
                        list.add(val);
                        map.remove(key);
                        map.put(key, val);
                    } else {
                        list.add(-1);
                    }
                    break;
                default:
            }
        }
        int[]res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;

    }
}
