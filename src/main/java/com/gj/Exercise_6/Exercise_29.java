package com.gj.Exercise_6;

import java.util.ArrayList;

public class Exercise_29 {
    ArrayList<Integer> res = new ArrayList<>();
    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        hel(xianxu,0,xianxu.length-1,zhongxu,0,zhongxu.length-1,0);
        int [] r = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            r[i] = res.get(i);
        }
        return r;
    }
    public void hel(int[] pre,int preleft,int preright,int[] in,int inleft,int inright,int level){
        if (preleft>preright || inleft>inright){
            return;
        }
        int rootval = pre[preleft];
        if (res.size()<=level){
            res.add(rootval);
        }else {
            res.set(level,rootval);
        }
        for (int i = inleft; i <=inright ; i++) {
            if (in[i]==rootval){
                hel(pre,preleft+1,i-inleft+preleft,in,inleft,i-1,level+1);
                hel(pre,i-inleft+preleft+1,preright,in,i+1,inright,level+1);
            }
        }
    }
}
