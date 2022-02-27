package com.gj.Exercise_8;

public class Exerrcise_55 {
    public int hel(char[] num, int n){
        int maxlen = 0;
        int sum=0,currentlen=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                currentlen = j-i+1;
                sum += num[j]-'0';
                if (currentlen%2==0 && sum==currentlen/2 && currentlen>=maxlen){
                    maxlen = currentlen;
                }
            }
        }
        return maxlen;
    }
}
