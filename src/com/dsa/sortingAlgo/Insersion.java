package com.dsa.sortingAlgo;

public class Insersion {
    public static void main(String[] args) {
        int[] arr ={13,25,323,5,2,124,3423};
        int n = arr.length;
        insertionSort(arr,n);
        for(int a:arr){
            System.out.println(a);
        }
    }
    private static void insertionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
