package com.gj.Exercise_6;

import java.util.*;

public class Exercise_1 {

    public static void main(String[] args) {
        int[][] operators = new int[][]{{1,1,1},{1,2,2},{1,3,2},{2,1},{1,4,4},{2,2}};
        int[] res = LRU(operators,3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] LRU (int[][] operators, int k) {

        ArrayList<Integer>arrayList = new ArrayList<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < operators.length; i++) {
            if (operators[i][0]==1){
                if (map.size()<k){
                    map.put(operators[i][1],operators[i][2]);
                }else {
                    Iterator it = map.keySet().iterator();
                    map.remove(it.next());
                    map.put(operators[i][1],operators[i][2]);
                }
            }else if (operators[i][0]==2){
                if (map.containsKey(operators[i][1])){
                    int val = map.get(map.get(operators[i][1]));
                    arrayList.add(val);
                    map.remove(operators[i][1]);
                    map.put(operators[i][1],val);

                }else {
                    arrayList.add(-1);
                }
            }
        }
        int []res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;

    }


}
