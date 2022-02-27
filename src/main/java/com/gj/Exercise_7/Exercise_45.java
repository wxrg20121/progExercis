package com.gj.Exercise_7;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Exercise_45 {
    public String[][] topKstrings (String[] strings, int k) {
        // write code here
        Map<String,Integer>map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])){
                map.put(strings[i],map.get(strings[i])+1);
            }else {
                map.put(strings[i],1);
            }
        }
        PriorityQueue<String>minq = new PriorityQueue<String>((o1,o2)->map.get(o1).equals(map.get(o2))?o2.compareTo(o1):map.get(o1)-map.get(o2));
        for (String str:map.keySet()) {
            minq.offer(str);
            if (minq.size()>k){
                minq.poll();
            }
        }
        String[][]res = new String[k][2];
        int i = k-1;
        while (!minq.isEmpty()){
            String key = minq.poll();
            res[i][0] = key;
            res[i][1] = map.get(key)+"";
            i--;
        }
        return res;
    }
}
