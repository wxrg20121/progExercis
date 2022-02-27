package com.gj.exercise_2;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * Description
 *
 * Given a collection of intervals, merge all overlapping intervals.
 *
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 *
 *
 *
 *
 */

class Interval{
    int start;
    int end;
    Interval(){
        start=0;
        end=0;
    }
    Interval(int s,int e){
        start=s;
        end=e;
    }
}

public class Exercise_68 {


    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new LinkedList<Interval>();
        if (intervals==null || intervals.isEmpty()){
            return res;
        }

        Collections.sort(intervals,new Comparator<Interval>(){
            public int compare(Interval a,Interval b){
                return a.start-b.start;
            }
        });


        Interval pre = intervals.get(0);
        for (int i = 1; i < intervals.size(); i++) {
            Interval cur = intervals.get(i);
            if (cur.start>pre.end){
                res.add(pre);
                pre = cur;
            }else {
                pre.start = Math.min(pre.start,cur.start);
                pre.end = Math.max(pre.end,cur.end);
            }
        }
        res.add(pre);
        return res;
    }

}
