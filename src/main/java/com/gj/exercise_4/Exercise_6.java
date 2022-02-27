package com.gj.exercise_4;

import java.util.HashMap;

public class Exercise_6 {
    public int maxLength (int[] arr) {
        // write code here
        int []pos = new int[100005];
        int res = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            start = Math.max(start,pos[cur]);
            res = Math.max(res,i-start+1);
            pos[cur] = i+1;
        }

        return res;
    }

    public int maxLength2 (int[] arr) {
        // write code here

        HashMap<Integer,Integer>map = new HashMap<>();
        int start = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            start = Math.max(start,!map.containsKey(cur) ? 0 : map.get(cur));
            res = Math.max(res,i-start+1);
            map.put(cur,i+1);
        }

        return res;
    }

    public int maxLength3 (int[] arr) {
        // write code here

        HashMap<Integer,Integer>map = new HashMap<>();
        int res = 0;
        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            int cur = arr[i];
            start = Math.max(start,map.containsKey(cur)?map.get(cur):0);
            res = Math.max(res,i-start+1);
            map.put(cur,i+1);
        }
        return res;
    }

}
