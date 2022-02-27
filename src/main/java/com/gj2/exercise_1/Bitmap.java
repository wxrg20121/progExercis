package com.gj2.exercise_1;

public class Bitmap {

    private byte bitmap[];
    private int length;

    public boolean get(int number){
        //获取位置
        int site=number>>>3;//等价于 site=number/8
        //获取该字节
        byte temp=bitmap[site];

        //获取该字节的第几个
        int i=number&7;//等价于 i=number%8
        byte comp=1;

        //将这个字节数右移(7-i)位（也就是把要查找的位移动到最右侧），然后与 0000 0001相与
        if(((temp>>>(7-i))&1)==0){
            return false;
        }
        return true;
    }
    private void set(int number, boolean bool){
        //获取位置
        int site=number>>>3;//等价于 site=number/8
        //获取该字节
        byte temp=bitmap[site];

        //获取该字节的第几个
        int i=number&7;//等价于 i=number%8
        //将0000 0001 左移(7-i)
        byte comp= (byte) (1<<(7-i));

        if(bool){//设置为1
            bitmap[site]= (byte) (comp|temp);//取或(0.. 1 0..)
        }else {//设置为0
            comp= (byte) ~comp;//取反
            bitmap[site]= (byte) (comp&temp);//相与(1.. 0 1..)
        }
    }
    public void add(int index){
        set(index,true);
    }
    public void delete(int index){
        set(index,false);
    }

    public Bitmap (int length){
        this.length=length;
        bitmap=new byte[length>>>3];
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args){
        Bitmap bitmap=new Bitmap(2561);
        bitmap.add(2311);
        System.out.println(bitmap.get(2311));
    }

}
