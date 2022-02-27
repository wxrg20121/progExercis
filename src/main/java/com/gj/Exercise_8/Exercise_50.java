package com.gj.Exercise_8;

public class Exercise_50 {
    public double maxProduct(double[] arr) {
        double max = arr[0];
        double min = arr[0];
        double res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            double lastmax=max,lastmin=min;
            max = Math.max(arr[i],Math.max(lastmax*arr[i],lastmin*arr[i]));
            min = Math.min(arr[i],Math.min(lastmax*arr[i],lastmin*arr[i]));
            res = Math.max(res,max);
        }
        return res;
    }
}
