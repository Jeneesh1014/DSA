package com.dsa.Array.Easy.Question11;
//Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one. Find that single one.
//
//        Example 1:
//        Input Format: arr[] = {2,2,1}
//        Result: 1
//
//        Example 2:
//        Input Format: arr[] = {4,1,2,1,2}
//        Result: 4

public class Answer11 {
    public static void main(String[] args) {
        int[] arr ={4,1,2,1,2};
        int xor = 0;
        for(int i=0;i<arr.length;i++){
            xor ^=arr[i];
        }
        System.out.println(xor);
    }
}
