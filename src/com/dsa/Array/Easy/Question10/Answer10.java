package com.dsa.Array.Easy.Question10;

//Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.
//
//        Example 1:
//
//        Input: prices = {1, 1, 0, 1, 1, 1}
//        Output: 3
//
//        Example 2:
//
//        Input: prices = {1, 0, 1, 1, 0, 1}
//        Output: 2


public class Answer10 {
    public static void main(String[] args) {
        int[] arr ={1, 0, 1, 1, 0, 1};
        int max=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                max=Math.max(max,count);
                count=0;
            }else{
                count++;
            }
        }
        int ans = Math.max(count,max);
        System.out.println(ans);


    }
}
