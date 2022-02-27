package com.gj.exercise_5;

public class Exercise_81 {
//    public double maxProduct(double[] arr) {
//        double max = 1.0;
//        double min = 1.0;
//        double res = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]<0){
//                max = max+min;
//                min = max-min;
//                max = max-min;
//            }
//            max = Math.max(max,max*arr[i]);
//            min = Math.min(min,min*arr[i]);
//            res = Math.max(max,res);
//        }
//        return res;
//    }

    public double maxProduct(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        double res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            double lastmax = max,lastmin = min;
            min = Math.min(arr[i],Math.min(arr[i]*lastmax,arr[i]*lastmin));
            max = Math.max(arr[i],Math.max(arr[i]*lastmax,arr[i]*lastmin));
            res = Math.max(max,res);
        }
        return res;
    }
}
