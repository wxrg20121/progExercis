package com.gj2.exercise_1;

import java.util.ArrayList;
import java.util.BitSet;

public class HBitset {
    //分段式bitset存储在list中
    private ArrayList<BitSet> bitsetList = new ArrayList();
    //下标最大值
    private long max;
    //每段值大小
    private int seg;
    // 根据下标最大值，段大小初始化bitset
    HBitset(long max,int seg) {
        this.max = max;
        this.seg = seg;
        int segs = (int) (max / seg) + 1;
        for (int i = 0; i < segs; i++) {
            BitSet temp = new BitSet(seg);
            bitsetList.add(temp);
        }
    }

    /**
     * 把数字插入Bitset
     * @param num
     * @return
     */
    public void set(long num){
        getSegBitset(num).set(getBsOffset(num));
    }

    public boolean get(long num){
        return getSegBitset(num).get(getBsOffset(num));
    }

    // 获取段 bitset
    private BitSet getSegBitset(long index) {
        int segNum = (int) (index / seg);
        return bitsetList.get(segNum);
    }

    // 获取段 bitset的偏移量
    private int getBsOffset(long index) {
        int offset = (int) (index % seg);
        return offset;
    }

}
