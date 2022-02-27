package com.gj.exercise_1;

/*/
题目描述
请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Exercise_2 {
    public static String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                stringBuffer.append('%');
                stringBuffer.append('2');
                stringBuffer.append('0');
            }else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
//        StringBuffer str = new StringBuffer("We Are Happy.");
//        System.out.println(replaceSpace(str));
        permutation("qwe".toCharArray(),0);
    }



    public static void permutation(char[] ch, int n){//ch表示重新排列后的字符数组，n表示处理第几个坑位
        if (n==ch.length){
            System.out.println(String.valueOf(ch));
        }
        for (int i=n;i<ch.length;i++){
            char temp = ch[n];
            ch[n] = ch[i];
            ch[i] = temp;
            permutation(ch,n+1);
            temp = ch[n];
            ch[n] = ch[i];
            ch[i] = temp;
        }

    }


}
