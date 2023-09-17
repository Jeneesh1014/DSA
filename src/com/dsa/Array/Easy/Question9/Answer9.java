package com.dsa.Array.Easy.Question9;

//Problem Statement: Given an integer N and an array of size N-1 containing N-1 numbers between 1 to N.
//        Find the number(between 1 to N), that is not present in the given array.
//
//        Example 1:
//        Input Format: N = 5, array[] = {1,2,4,5}
//        Result: 3
//
//        Example 2:
//        Input Format: N = 3, array[] = {1,3}
//        Result: 2

public class Answer9 {
    public static void main(String[] args) {
        int N=5;
        int[] arr = {1,2,4,5};
        int sum =(N*(N+1))/2;
        int sum2=0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        int ans = sum-sum2;
        System.out.println(ans);
    }
}
