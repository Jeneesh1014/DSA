package com.dsa.sortingAlgo;

public class Selection {

    public static void main(String[] args) {
        int[] arr ={13,25,323,5,2,124,3423};
        int n = arr.length;
        selectionSort(arr,n);
        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void selectionSort(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
}
