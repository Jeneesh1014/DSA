package com.dsa.Array.Easy.Qustion1;

//Given an array, we have to find the largest element in the array.
//
//        Example 1:
//        Input: arr[] = {2,5,1,3,0};
//        Output: 5
//        Explanation: 5 is the largest element in the array.
//
//        Example2:
//        Input: arr[] = {8,10,5,7,9};
//        Output: 10
//        Explanation: 10 is the largest element in the array.
//

public class Answer1 {
    public static void main(String[] args) {
        int[] arr={21,23,3,4,6,67,224,230};

        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max Element is : "+max);
    }
}
