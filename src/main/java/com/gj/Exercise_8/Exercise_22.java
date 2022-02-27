package com.gj.Exercise_8;
import java.util.*;

public class Exercise_22 {
    public String[][] topKstrings (String[] strings, int k) {
        // write code here
        if (strings==null || strings.length==0) return null;
        Map<String,Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])){
                map.put(strings[i],map.get(strings[i])+1);
            }else {
                map.put(strings[i],1);
            }
        }
        PriorityQueue<String> minq = new PriorityQueue<>((o1,o2)->map.get(o1).equals(map.get(o2))?o2.compareTo(o1):map.get(o1)-map.get(o2));
        for (String key:map.keySet()){
            minq.offer(key);
            if (minq.size()>k){
                minq.poll();
            }
        }
        String[][] res = new String[k][2];
        for (int i = k-1; i >=0 ; i--) {
            String key = minq.poll();
            res[i][0] = key;
            res[i][1] = map.get(key)+"";
        }
        return res;
    }
}
