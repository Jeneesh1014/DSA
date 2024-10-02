package com.dsa.DP.oneDimensionDP;


// https://takeuforward.org/data-structure/dynamic-programming-frog-jump-dp-3/

public class FrogJump {
    public static void main(String[] args) {
        int n = 4;
        int[] arr ={10,20,30,10};
        int ans = minDistance(arr,n-1);
        System.out.println("Answer :"+ans);

    }
    private static int minDistance(int[] arr,int index){

        // Base Case: if frog is on the first stone,no Energy Required
        if(index==0) return 0;

        // Step 1: Compute the energy required to jump from the previous stone (i-1)
        int leftJump = minDistance(arr, index - 1) + Math.abs(arr[index] - arr[index - 1]);

        // Step 2: If possible, compute the energy required to jump from two stones back (i-2)
        int rightJump = Integer.MAX_VALUE;
        if (index > 1) {
            rightJump = minDistance(arr, index - 2) + Math.abs(arr[index] - arr[index - 2]);
        }

        // Step 3: Return the minimum of the two jump options
        return Math.min(leftJump, rightJump);
    }
}
