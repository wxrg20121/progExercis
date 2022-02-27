package com.gj.exercise_1;

/**
 *
 *将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。 数值为0或者字符串不是一个合法的数值则返回0
 *
 * 输入描述 输入一个字符串,包括数字字母符号,可以为空
 * 输出描述 如果是合法的数值表达则返回该数字，否则返回0
 *
 * 输入："+2147483647"
 *
 * 输出：2147483647
 *
 */

public class Exercise_49 {


    public static void main(String[] args) {
        System.out.println(StrToInt("+2147400647"));
    }



    public static int StrToInt(String str) {
        if (str.length()==0) {
            return 0;
        }

        char []arr = str.toCharArray();
        if (arr[0]!='+' && arr[0]!='-' && (arr[0]>'9' || arr[0]<'0')){
            return 0;
        }

        int i = 0;
        if (arr[0]=='+' || arr[0]=='-'){
            i = 1;
        }
        int sum = 0;
        for (; i < arr.length; i++) {
            if (arr[i]>'9'||arr[i]<'0'){
                return 0;
            }
            sum = sum*10 + arr[i] - '0';
        }

        if (arr[0]=='-'){
            sum = -1 * sum;
        }
        return sum;

    }



//    public int StrToInt(String str) {
//        if (str.length()==0) {
//            return 0;
//        }
//        char[]arr = str.toCharArray();
//        if (arr[0]!='+'&&arr[0]!='-'&&arr[0]>'9') {
//            return 0;
//        }
//        int i = 0;
//        if (arr[0]=='-'||arr[0]=='+') {
//            i=1;
//        }
//        int sum = 0;
//        for (; i < arr.length; i++) {
//
//            if (arr[i]>'9') {
//                return 0;
//            }
//            if (arr[i]=='0') {
//                continue;
//            }
//            sum = sum*10+arr[i]-48;
//        }
//
//        if (arr[0]=='-') {
//            sum = sum*-1;
//        }
//        return sum;
//    }

}

