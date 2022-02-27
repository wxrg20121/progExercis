package com.gj.Exercise_6;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Exercise_35 {
    public String[][] topKstrings (String[] strings, int k) {
        // write code here
        HashMap<String,Integer> map = new HashMap<>();
        for (String string:strings) {
            if (map.containsKey(string)){
                map.put(string,map.get(string)+1);
            }else {
                map.put(string,1);
            }
        }
        PriorityQueue<String> minq = new PriorityQueue<String>((o1,o2)->map.get(o1).equals(map.get(o2))?o2.compareTo(o1):map.get(o1)-map.get(o2));

        for (String s:map.keySet()) {
            minq.offer(s);
            if (minq.size()>k){
                minq.poll();
            }
        }
        String [][]res = new String[k][2];
        int j = k-1;
        while (!minq.isEmpty()){
            String temp = minq.poll();
            res[j][0] = temp;
            res[j][1] = map.get(temp) + "";
            j--;
        }
        return res;

    }
}
