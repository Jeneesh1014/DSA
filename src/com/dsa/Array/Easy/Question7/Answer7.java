package com.dsa.Array.Easy.Question7;


//Problem Statement: You are given an array of integers,
//                   your task is to move all the zeros in the array to the end of the array
//                   and move non-negative integers to the front by maintaining their order.
//
//        Example 1:
//        Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
//        Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
//
//        Example 2:
//        Input: 1,2,0,1,0,4,0
//        Output: 1,2,1,4,0,0,0


import java.util.Arrays;

public class Answer7 {
    public static void main(String[] args) {
        int[] nums = {1,0,2,4,4,3,43,5,5,6,2,0,0,4,2,0,0,1,0};
        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }
        }
        for(int j=k;j<nums.length;j++){
            nums[j]=0;
        }

        System.out.println(Arrays.toString(nums));

    }
}
