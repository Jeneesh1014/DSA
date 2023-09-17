package com.dsa.Array.Easy.Question6;

//Problem Statement: Given an array of integers, rotating array of elements by k elements  either left or right .
//
//        Example 1:
//        Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2
//
//        Example 2:
//        Input: N = 6, array[] = {3,7,8,9,10,11} , k=3


import java.util.Arrays;

public class Answer6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        int n = arr.length;
        rotatedLeft(arr, k, n);
        System.out.println(Arrays.toString(arr));

    }

    private static void rotatedLeft(int[] arr, int k, int n) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }


    }
}
// you can try right by your self