package com.gj.exercise_9.exercise_12;

import java.util.PriorityQueue;

public class Exercise_91 {

    int count = 0;
    PriorityQueue<Integer>minq = new PriorityQueue<>();
    PriorityQueue<Integer>maxq = new PriorityQueue<>(((o1, o2) -> o2.compareTo(o1)));

    public void Insert(Integer num) {
        count++;
        if (count%2==0){
            if (!maxq.isEmpty()&&num<maxq.peek()){
                maxq.offer(num);
                num = maxq.poll();
            }
            minq.offer(num);
        }else {
            if (!minq.isEmpty()&&num>minq.peek()){
                minq.offer(num);
                num = minq.poll();
            }
            maxq.offer(num);
        }
    }

    public Double GetMedian() {
        if (count%2==0){
            return (maxq.peek()+minq.peek())/2.0;
        }else {
            return (double)maxq.peek();
        }
    }

}
