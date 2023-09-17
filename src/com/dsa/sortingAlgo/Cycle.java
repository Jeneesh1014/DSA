package com.dsa.sortingAlgo;


// when you need to sort [1,n] or [0,n]
public class Cycle {
    public static void main(String[] args) {
        int[] arr ={1,4,2,5,3};
        int n = arr.length;
        cycleSort(arr,n);
        for(int a:arr){
            System.out.println(a);
        }
    }

    private static void cycleSort(int[] arr, int n) {

        int i=0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
    }
}
