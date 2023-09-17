package com.dsa.Array.Easy.Question4;


//Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once.
//        The relative order of the elements should be kept the same.
//
//        If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result.
//        It does not matter what you leave beyond the first k elements.
//
//        Note: Return k after placing the final result in the first k slots of the array.

//Example 1:
//
//        Input: arr[1,1,2,2,2,3,3]
//
//        Output: arr[1,2,3,_,_,_,_]
//
//        Example 2:
//
//        Input: arr[1,1,1,2,2,3,3,3,3,4,4]
//
//        Output: arr[1,2,3,4,_,_,_,_,_,_,_]


import java.util.Arrays;

public class Answer4 {
    public static void main(String[] args) {

        int[] arr = {1,1,2,2,2,3,3};
        int idx=1;

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[idx++]=arr[i];
            }
        }
        for(int i=0;i<idx;i++){
            System.out.println(arr[i]);
        }

    }
}
