package com.gj.exercise_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Exercise_45 {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval>arrayList = new ArrayList<>();
        if (intervals==null || intervals.size()==0) return arrayList;

        Collections.sort(intervals,(o1,o2)->o1.start-o2.start);
        Interval first = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval temp = intervals.get(i);
            if (first.end>=temp.start){
                first.end = Math.max(first.end,temp.end);
            }else {
                arrayList.add(first);
                first = temp;
            }
        }
        arrayList.add(first);
        return arrayList;

    }
}
