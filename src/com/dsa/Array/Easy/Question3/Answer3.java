package com.dsa.Array.Easy.Question3;


//Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing)
//                   order or not. If the array is sorted then return True, Else return False.
//Note: Two consecutive equal values are considered to be sorted.

//        Example 1:
//        Input: N = 5, array[] = {1,2,3,4,5}
//        Output: True.
//
//        Example 2:
//        Input: N = 5, array[] = {5,4,6,7,8}
//        Output: False.






public class Answer3 {
    public static void main(String[] args) {

        int[] arr = {1,4,6,7,9,2};
        System.out.println(isSorted(arr));
    }
    private static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) return false;
        }
        return true;
    }
}
