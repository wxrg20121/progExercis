package com.gj.exercise_9;

import java.util.ArrayList;

public class Exercise_32 {
    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        if (xianxu.length!=zhongxu.length) return null;
        ArrayList<Integer>arrayList = new ArrayList<>();
        hel(xianxu,0,xianxu.length-1,zhongxu,0,zhongxu.length-1,arrayList,0);
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;

    }

    public void hel(int[] pre, int preleft, int preright, int[] in, int inleft, int inright, ArrayList<Integer>arrayList, int level){
        if (preleft>preright || inleft>inright){
            return;
        }
        int val = pre[preleft];
        if (arrayList.size()<=level){
            arrayList.add(val);
        }else {
            arrayList.set(level,val);
        }
        for (int i = inleft; i <= inright; i++) {
            if (in[i]==val){
                hel(pre,preleft+1,i-inleft+preleft,in,inleft,i-1,arrayList,level+1);
                hel(pre,i-inleft+preleft+1,preright,in,i+1,inright,arrayList,level+1);
            }
        }
    }
}
