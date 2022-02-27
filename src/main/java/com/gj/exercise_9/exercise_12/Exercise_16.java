package com.gj.exercise_9.exercise_12;

public class Exercise_16 {
    public void merge(int A[], int m, int B[], int n) {
        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (i>=0 && j>=0){
            if (A[i]>B[j]){
                A[k--] = A[i--];
            }else {
                A[k--] = B[j--];
            }
        }
        while (i>=0){
            A[k--] = A[i--];
        }
        while (j>=0){
            A[k--] = B[j--];
        }
    }
}
