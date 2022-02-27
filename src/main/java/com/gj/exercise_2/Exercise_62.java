package com.gj.exercise_2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * 如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，
 * 那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 *
 */

public class Exercise_62 {
    int count = 0;
    PriorityQueue<Integer> minq = new PriorityQueue<>();
    PriorityQueue<Integer> maxq = new PriorityQueue<Integer>(11, new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    public void Insert(Integer num) {
        count++;
        if ((count&1)==0){
            if (!maxq.isEmpty() && num<maxq.peek()){
                maxq.offer(num);
                num = maxq.poll();
            }
            minq.offer(num);
        }else {
            if (!minq.isEmpty() && num>minq.peek()){
                minq.offer(num);
                num = minq.poll();
            }
            maxq.offer(num);
        }
    }

    public Double GetMedian() {
        double res;
        if ((count&1)==0){
            res = (minq.peek()+maxq.peek())/2.0;
        }else {
            res = maxq.peek();
        }
        return res;
    }


}
