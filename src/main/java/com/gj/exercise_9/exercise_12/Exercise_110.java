package com.gj.exercise_9.exercise_12;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Exercise_110 {
    public int minmumNumberOfHost (int n, int[][] startEnd) {
        // write code here
        Arrays.sort(startEnd,((o1, o2) -> o1[0]==o2[0]?o1[1]-o2[1]:o1[0]-o2[0]));
        PriorityQueue<Integer>minq = new PriorityQueue<>();
        int res = 0;
        for (int i = 0; i < startEnd.length; i++) {
            int start = startEnd[i][0];
            int end = startEnd[i][1];
            if (!minq.isEmpty()&&start>minq.peek()){
                minq.poll();
            }else {
                res++;
            }
            minq.offer(end);
        }
        return res;
    }
}
