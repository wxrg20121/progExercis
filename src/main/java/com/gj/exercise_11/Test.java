package com.gj.exercise_11;

import java.util.*;

public class Test {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int[] arr = new int[10];
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }
            //Arrays.sort(arr);
            int target = sum / 2;
            ArrayList<ArrayList<Integer>> arraylist_all = new ArrayList<ArrayList<Integer>>();
            //hel(arr,target,new int[10],new ArrayList<Integer>(),arraylist_all);
            //ArrayList<Integer>arrayList = arraylist_all.get(0);
            //int sum1=0;
            //for(int i=0;i<arrayList.size();i++){
            //sum1+=arrayList.get(i);
            //}
            //System.out.println(Math.abs(sum-sum1-sum1));
            hel(arr, sum, new int[10], new ArrayList<Integer>());
            System.out.println(min);
            min = Integer.MAX_VALUE;

//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//            int[] arr = new int[10];
//            int sum = 0;
//            for (int i = 0; i < 10; i++) {
//                arr[i] = sc.nextInt();
//                sum += arr[i];
//            }
//            System.out.println(sum);
//
//            int target = sum;
//            ArrayList<ArrayList<Integer>>arraylist_all = new ArrayList<ArrayList<Integer>>();
//            hel(arr,sum,new int[10],new ArrayList<Integer>());
//            System.out.println(min);
//            min = Integer.MAX_VALUE;
        }
    }


    public static void hel(int[]arr, int target, int[]used,ArrayList<Integer>arraylist){
        if(arraylist.size()==5){
            int sum=0;
            for (int i = 0; i < arraylist.size(); i++) {
                sum+=arraylist.get(i);
            }
            min = Math.min(min,Math.abs(target-sum-sum));
            //return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]==0){
                arraylist.add(arr[i]);
                used[i]=1;
                hel(arr,target-arr[i],used,arraylist);
                used[i]=0;
                arraylist.remove(arraylist.size()-1);
            }
        }
    }

    public static void hel(int[]arr, int target, int[]used,ArrayList<Integer>arraylist,ArrayList<ArrayList<Integer>>arraylist_all){
        if(arraylist.size()==5){
            int sum=0;
            for (int i = 0; i < arraylist.size(); i++) {
                sum+=arraylist.get(i);
            }
            min = Math.min(min,Math.abs(target-sum-sum));
            arraylist_all.add(new ArrayList<>(arraylist));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(used[i]==0){
                arraylist.add(arr[i]);
                used[i]=1;
                hel(arr,target-arr[i],used,arraylist,arraylist_all);
                used[i]=0;
                arraylist.remove(arraylist.size()-1);
            }
        }
    }

}
