package com.gj.exercise_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Exercise_80 {

    public static void main(String[] args) {
//        int[][]operations = {{1,5},{2},{1,3},{2},{1,6},{2},{1,7},{2}};
        int[][]operations = {{2},{1,1},{2}};
        double[] res = flowmedian(operations);
        System.out.println(Arrays.toString(res));
    }

    public static double[] flowmedian (int[][] operations) {
        // write code here

        PriorityQueue<Integer>minq = new PriorityQueue<>(); //偶
        PriorityQueue<Integer>maxq = new PriorityQueue<>((o1,o2)->o2-o1); //奇
        ArrayList<Double>arrayList = new ArrayList<>();
        int label = 1;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i][0]==1){
                int val = operations[i][1];
                if (label%2!=0){
                    if (!minq.isEmpty() && val>minq.peek()){
                        minq.offer(val);
                        val = minq.poll();
                    }
                    maxq.offer(val);
                }else {
                    if (!maxq.isEmpty() && val<maxq.peek()){
                        maxq.offer(val);
                        val = maxq.poll();
                    }
                    minq.offer(val);
                }
                label++;
            }else if (operations[i][0]==2){
                if ((maxq.size()+minq.size())==0){
                    arrayList.add(-1.0);
                }else if ((maxq.size()+minq.size())%2!=0){
                    arrayList.add((double)maxq.peek());
                }else {
                    arrayList.add((double)(maxq.peek()+minq.peek())/2);
                }
            }
        }
        double[] res = new double[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }
}
