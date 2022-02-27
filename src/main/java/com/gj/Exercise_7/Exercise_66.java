package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;


public class Exercise_66 {

    public int[] LFU (int[][] operators, int k) {
        // write code here
        Map<Integer,Node>map = new HashMap<>();
        Map<Integer,int[]>temp = new HashMap<>();
        PriorityQueue<Integer>minq = new PriorityQueue<>((o1,o2)->map.get(o1).count.equals(map.get(o2).count)?map.get(o1).time-map.get(o2).time:map.get(o1).count-map.get(o2).count);
        ArrayList<Integer>arrayList = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < operators.length; i++) {
            int key = operators[i][1];
            if (operators[i][0]==1){
                if (temp.size()==k){
                    int delkey = minq.poll();
                    map.remove(delkey);
                    temp.remove(delkey);
                }
                temp.put(key,operators[i]);
                if (map.containsKey(key)){
                    Node node1 = new Node(map.get(key).count+1,time++);
                    map.put(key,node1);
                }else {
                    map.put(key,new Node(1,time++));
                }
                minq.offer(key);
            }else if (operators[i][0]==2){
                if (temp.get(key)==null){
                    arrayList.add(-1);
                }else {
                    int[] operator = temp.get(key);
                    arrayList.add(operator[2]);
                    Node node2 = new Node(map.get(key).count+1,time++);
                    map.put(key,node2);
                    minq.offer(key);
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

