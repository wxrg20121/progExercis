package com.gj.Exercise_8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise_1 {
    public int[] LRU (int[][] operators, int k) {
        // write code here
        Map<Integer,Integer>map = new LinkedHashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < operators.length; i++) {
            int opt = operators[i][0];
            int key = operators[i][1];
            if (opt==1){
                int val = operators[i][2];
                if (map.size()>=k){
                    Iterator it = map.keySet().iterator();
                    map.remove(it.next());
                }
                map.put(key,val);
            }else if (opt==2){
                if (map.containsKey(key)){
                    int val = map.get(key);
                    arrayList.add(map.get(key));
                    map.remove(key);
                    map.put(key,val);
                }else {
                    arrayList.add(-1);
                }
            }
        }
        int[]res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;

    }
}
