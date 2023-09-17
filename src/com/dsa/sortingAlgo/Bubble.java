package com.dsa.sortingAlgo;

public class Bubble {
    public static void main(String[] args) {
        int[] arr ={13,25,323,5,2,124,3423};
        int n = arr.length;
        bubbleSort(arr,n);
        for(int a:arr){
            System.out.println(a);
        }
    }
    private static void bubbleSort(int[] arr, int n) {
       for(int i=n-1;i>=0;i--){
           int didSwap = 0;
           for(int j=0;j<i;j++){
               if(arr[j]>arr[j+1]){
                   int temp = arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1]=temp;
                   didSwap=1;
               }
           }
           if(didSwap==0) return;
       }
    }
}
