package com.bootcoding.dsa.recurrsion.morning;

public class PrintHW {
    public static void main(String[] args) {
        printhello("Hello world",5);
    }
    public static void printhello (String s,int n){
        if(n>0){
            System.out.println("Hello World");
            printhello(s,n-1);
        }
    }
}
