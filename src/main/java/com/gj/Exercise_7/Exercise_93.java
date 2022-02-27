package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Exercise_93 {
    public double[] flowmedian (int[][] operations) {
        // write code here
        PriorityQueue<Integer>minq = new PriorityQueue<>();
        PriorityQueue<Integer>maxq = new PriorityQueue<>((o1,o2)->o2-o1);
        ArrayList<Double>arrayList = new ArrayList<>();

        int flag = 1;
        for (int i = 0; i < operations.length; i++) {
            int opt = operations[i][0];
            if (opt==1){
                int val = operations[i][1];
                if (flag%2!=0){
                    if (!minq.isEmpty()){
                        minq.offer(val);
                        val = minq.poll();
                    }
                    maxq.offer(val);
                }else {
                    if (!maxq.isEmpty()){
                        maxq.offer(val);
                        val = maxq.poll();
                    }
                    minq.offer(val);
                }
                flag++;
            }else if (opt==2){
                if (minq.size()+maxq.size()==0){
                    arrayList.add(-1.0);
                }else if ((minq.size()+maxq.size())%2==0){
                    arrayList.add((minq.peek()+maxq.peek())/2.0);
                }else {
                    arrayList.add(maxq.peek()/1.0);
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
