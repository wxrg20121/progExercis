package com.gj.Exercise_8;

import java.util.ArrayList;

public class Exercise_18 {
    public int[] solve (int[] xianxu, int[] zhongxu) {
        // write code here
        if (xianxu.length!=zhongxu.length) return null;
        ArrayList<Integer>arrayList=new ArrayList<>();
        hel(xianxu,0,xianxu.length-1,zhongxu,0,zhongxu.length-1,arrayList,0);
        int[] res = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            res[i] = arrayList.get(i);
        }
        return res;

    }
    public void hel(int[]pre, int preleft, int preright, int[]mid, int midleft, int midright, ArrayList<Integer>arrayList,int level){
        if (preleft>preright || midleft>midright){
            return;
        }
        int val = pre[preleft];
        if (arrayList.size()<=level){
            arrayList.add(val);
        }else {
            arrayList.set(level,val);
        }
        for (int i = midleft; i <= midright; i++) {
            if (mid[i]==val){
                hel(pre,preleft+1,i-midleft+preleft,mid,midleft,i-1,arrayList,level+1);
                hel(pre,i-midleft+preleft+1,preright,mid,i+1,midright,arrayList,level+1);
            }
        }
    }
}
