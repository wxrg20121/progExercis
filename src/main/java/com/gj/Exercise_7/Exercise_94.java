package com.gj.Exercise_7;

public class Exercise_94 {
    public double maxProduct(double[] arr) {
        double res = arr[0];
        double min = arr[0];
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            double lastmin = min,lastmax = max;
            min = Math.min(arr[i],Math.min(arr[i]*lastmin,arr[i]*lastmax));
            max = Math.max(arr[i],Math.max(arr[i]*lastmin,arr[i]*lastmax));
            res = Math.max(res,max);
        }
        return res;
    }
}
