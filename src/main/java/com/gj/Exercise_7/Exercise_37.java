package com.gj.Exercise_7;

import java.util.ArrayList;

public class Exercise_37 {
    private ArrayList<Integer>arrayList = new ArrayList<>();
    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        hel(xianxu,0,xianxu.length-1,zhongxu,0,zhongxu.length-1,0);
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;
    }

    public void hel(int[]pre,int preleft,int preright,int[] in,int inleft,int inright,int level){
        if (preleft>preright || inleft>inright){
            return;
        }
        int rootval = pre[preleft];
        if (arrayList.size()<=level){
            arrayList.add(rootval);
        }else {
            arrayList.set(level,rootval);
        }
        for (int i = inleft; i <= inright; i++) {
            if (in[i]==rootval){
                hel(pre,preleft+1,i-inleft+preleft,in,inleft,i-1,level+1);
                hel(pre,i-inleft+preleft+1,preright,in,i+1,inright,level+1);
                break;
            }
        }
    }
}
