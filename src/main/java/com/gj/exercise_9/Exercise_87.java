package com.gj.exercise_9;

public class Exercise_87 {
    public double maxProduct(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        double res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            double lastmax = max,lastmin = min;
            max = Math.max(arr[i],Math.max(arr[i]*lastmax,arr[i]*lastmin));
            min = Math.min(arr[i],Math.min(arr[i]*lastmax,arr[i]*lastmin));
            res = Math.max(res,max);
        }
        return res;
    }
}
