package com.bootcoding.leetcode75.array;

public class lc1480 {
    public static void main(String[] args) {
    int nums[] ={1,2,3,4};
    runningSum(nums);
    }
    public static void runningSum(int[] nums) {
        int sum =0;
        for(int i=0;i< nums.length;i++){
            sum += nums[i];
            nums[i]=sum;
        }
        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}
