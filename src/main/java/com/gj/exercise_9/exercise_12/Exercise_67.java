package com.gj.exercise_9.exercise_12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Exercise_67 {
    public int[] LFU (int[][] operators, int k) {
        HashMap<Integer,Node> map = new HashMap<>();
        HashMap<Integer,int[]> temp = new HashMap<>();
        ArrayList<Integer>arrayList = new ArrayList<>();
        int time=0;
        PriorityQueue<Integer> minq = new PriorityQueue<>((o1, o2) -> map.get(o1).count==map.get(o2).count?map.get(o1).time-map.get(o2).time:map.get(o1).count-map.get(o2).count);
        for (int i = 0; i < operators.length; i++) {
            int opt = operators[i][0];
            int key = operators[i][1];
            if (opt==1){
                if (minq.size()==k){
                    int delkey = minq.poll();
                    map.remove(delkey);
                    temp.remove(delkey);
                }
                temp.put(key,operators[i]);
                if (map.containsKey(key)){
                    Node node = new Node(map.get(key).count+1,time++);
                    map.put(key,node);
                    minq.remove(key);
                    minq.offer(key);
                }else {
                    map.put(key,new Node(1,time++));
                    minq.offer(key);
                }
            }else if (opt==2){
                if (temp.containsKey(key)){
                    arrayList.add(temp.get(key)[2]);
                    map.put(key,new Node(map.get(key).count+1,time++));
                    minq.remove(key);
                    minq.offer(key);
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

class Node{
    public int count;
    public int time;
    public Node(int count,int time){
        this.count = count;
        this.time = time;
    }

}
