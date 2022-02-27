package com.gj.exercise_5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Exercise_43 {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval> arrayList = new ArrayList<>();
        if (intervals==null || intervals.size()==0) return arrayList;

//        Collections.sort(intervals, new Comparator<Interval>() {
//            @Override
//            public int compare(Interval o1, Interval o2) {
//                return o1.start-o2.start;
//            }
//        });

        Collections.sort(intervals,(w1,w2)->w1.start-w2.start);

        Interval left = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval right = intervals.get(i);
            if (left.end>=right.start){
                left.start = Math.min(left.start,right.start);
                left.end = Math.max(left.end,right.end);
            }else {
                arrayList.add(left);
                left = right;
            }
        }
        arrayList.add(left);
        return arrayList;
    }
}
