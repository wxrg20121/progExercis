package com.gj.exercise_9.exercise_12;

public class Exercise_92 {
    int res = 0;
    public int Nqueen (int n) {
        // write code here
        backracking(n,0,new boolean[n],new boolean[2*n],new boolean[2*n]);
        return res;
    }

    public void backracking(int n, int row, boolean[]colUsed,boolean[]diagUsed,boolean[]udiagUsed){
        if (row==n){
            res++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!colUsed[col] && !diagUsed[row+col] && !udiagUsed[row-col+n]){
                colUsed[col] = diagUsed[row+col] = udiagUsed[row-col+n] = true;
                backracking(n,row+1,colUsed,diagUsed,udiagUsed);
                colUsed[col] = diagUsed[row+col] = udiagUsed[row-col+n] = false;
            }
        }
    }
}
