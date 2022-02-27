package com.gj.exercise_5;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Exercise_36 {
    public String[][] topKstrings (String[] strings, int k) {
        // write code here
        HashMap<String,Integer>hashMap = new HashMap<>();
        for (String str:strings) {
            if (hashMap.containsKey(str)){
                hashMap.put(str,hashMap.get(str)+1);
            }else {
                hashMap.put(str,1);
            }

        }
        // 建立大小为k的小顶堆
        PriorityQueue<String> queue = new PriorityQueue<String>((w1,w2) -> hashMap.get(w1).equals(hashMap.get(w2)) ? w2.compareTo(w1) : hashMap.get(w1)-hashMap.get(w2));
        for (String str: hashMap.keySet()) {
            queue.offer(str);
            if (queue.size()>k)
                queue.poll();
        }
        String[][] res = new String[k][2];
        int j = k-1;
        while (!queue.isEmpty()){
            String temp = queue.poll();
            res[j][0]=temp;
            res[j][1]=hashMap.get(temp)+"";
            j--;
        }
        return res;
    }

    public String[][] topKstrings2 (String[] strings, int k) {
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (String str:strings) {
            if (hashMap.containsKey(str)){
                hashMap.put(str,hashMap.get(str)+1);
            }else {
                hashMap.put(str,1);
            }
        }
        PriorityQueue<String>queue = new PriorityQueue<String>((w1,w2)->hashMap.get(w1).equals(hashMap.get(w2)) ? w1.compareTo(w2) : hashMap.get(w2)-hashMap.get(w1));

        for (String str:hashMap.keySet()) {
            queue.offer(str);
            if (queue.size()>k){
                queue.poll();
            }
        }
        String[][] res = new String[k][2];
        int j = k-1;
        while (!queue.isEmpty()){
            String temp = queue.poll();
            res[j][0] = temp;
            res[j][1] = hashMap.get(temp)+"";
            j--;
        }
        return res;

    }
}
