package com.ravi;

public class Main {
    public static int fuct(int n)
    {
        if(n==1){
            return 1;

        }
        int a= fuct(n-1);
        a =  a*n;
        return a;
    }

    public static void main(String[] args) {
	int n = 5;
    int   a=fuct(n);
        System.out.println(a);
    }
}
