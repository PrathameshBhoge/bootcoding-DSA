package com.bootcoding.leetcode75.array;

public class lc_1365 {
    public static void main(String[] args) {
        int[] nums={8,1,2,2,3};
        System.out.println(smallerNumbersThanCurrent( nums));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
            int arr[]=new int[nums.length];
            for(int i=0;i< nums.length;i++){
                int count=0;
                for(int j=0;j< nums.length;j++){
                    if(nums[i]>nums[j]){
                        count++;
                    }
                }
                arr[i]=count;
            }
            return arr;
    }
}
