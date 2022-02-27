package com.gj.Exercise_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
 }


public class Exercise_53 {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        ArrayList<Interval>arrayList = new ArrayList<>();
        if (intervals==null || intervals.size()==0) return arrayList;
        Collections.sort(intervals,(o1,o2)->o1.start-o2.start);
        Interval interval = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval mid = intervals.get(i);
            if (interval.end>=mid.start){
                interval.end = Math.max(interval.end,mid.end);
            }else {
                arrayList.add(interval);
                interval = mid;
            }
        }
        arrayList.add(interval);
        return arrayList;
    }
}
