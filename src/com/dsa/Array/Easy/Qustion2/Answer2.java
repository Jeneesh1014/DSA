package com.dsa.Array.Easy.Qustion2;

//Given an array, find the second smallest and second-largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
//        Example 1:
//        Input: [1,2,4,7,7,5]
//        Output: Second Smallest : 2
//        Second Largest : 5
//
//        Example 2:
//        Input: [1]
//        Output: Second Smallest : -1
//        Second Largest : -1

public class Answer2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        int n = arr.length;
        int sl = secondLargest(arr,n);
        int ss = secondSmallest(arr,n);
        System.out.println("Second Largest : " + sl);
        System.out.println("Second Smallest : " + ss);
    }

    private static int secondLargest(int[] arr, int n) {
        if(n<2) return -1;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(max<arr[i]){
                secondMax=max;
                max= arr[i];
            }else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }

        }
        return secondMax;

    }

    private static int secondSmallest(int[] arr, int n) {
        if(n<2) return -1;
        int min =Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;


        for(int i=0;i<n;i++){
            if(min>arr[i]){
                secondMin=min;
                min = arr[i];
            }else if(arr[i]<secondMin && arr[i]!=min){
                secondMin=arr[i];
            }
        }

        return secondMin;

    }
}
