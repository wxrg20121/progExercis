package com.gj.exercise_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class Exercise_3 {
    public int[] LRU (int[][] operators, int k) {
        LinkedHashMap<Integer,Integer>map = new LinkedHashMap<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        for (int i = 0; i < operators.length; i++) {
            int opt = operators[i][0];
            int key = operators[i][1];
            if (opt==1){
                int val = operators[i][2];
                if (map.size()==k){
                    Iterator it = map.keySet().iterator();
                    map.remove(it.next());
                }
                map.put(key,val);
            }else if (opt==2){
                if (map.containsKey(key)){
                    int val = map.get(key);
                    arrayList.add(val);
                    map.remove(key);
                    map.put(key,val);
                }else {
                    arrayList.add(-1);
                }
            }
        }
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
