package com.bootcoding.dsa.SmartData;

public class ReverseArrayElementwithout2ndArray {
    public static void main(String[] args) {
        int [] a ={5,4,3,2,1}; // 5 , 1

        for(int i=0;i<a.length/2;i++){
            int temp =a[i]; // 5
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
