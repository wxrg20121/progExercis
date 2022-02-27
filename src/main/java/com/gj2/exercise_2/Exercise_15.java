package com.gj2.exercise_2;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Exercise_15 {
    public String[][] topKstrings (String[] strings, int k) {
        // write code here
        HashMap<String,Integer>map = new HashMap<>();
        PriorityQueue<String>minq = new PriorityQueue<>((o1,o2)->map.get(o1).equals(map.get(o2))?o2.compareTo(o1):map.get(o1)-map.get(o2));
        for (String str: strings) {
            if (map.containsKey(str)){
                map.put(str,map.get(str)+1);
            }else {
                map.put(str,1);
            }
        }
        for (String key:map.keySet()) {
            minq.offer(key);
            if (minq.size()>k){
                minq.poll();
            }
        }
        String [][] res = new String[k][2];
        for (int i = k-1; i >=0 ; i--) {
            String key = minq.poll();
            int val = map.get(key);
            res[i][0]=key;
            res[i][1]=val+"";
        }
        return res;
    }
}
