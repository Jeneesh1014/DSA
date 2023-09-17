package com.dsa.Array.Easy.Question5;

//Problem Statement: Given an array of N integers, left rotate the array by one place.
//
//        Example 1:
//        Input: N = 5, array[] = {1,2,3,4,5}
//        Output: 2,3,4,5,1
//
//        Example 2:
//        Input: N = 1, array[] = {3}
//        Output: 3

import java.util.Arrays;

public class Answer5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n = arr.length;
        rotatedArray(arr,n);
    }

    private static void rotatedArray(int[] arr, int n) {

        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
