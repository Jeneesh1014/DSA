package com.dsa.DP.oneDimensionDP;


// https://takeuforward.org/data-structure/dynamic-programming-frog-jump-with-k-distances-dp-4/


import java.util.Arrays;

public class FrogJumpWithKDistance {
    public static void main(String[] args) {
        int[] heights = {10, 30, 40, 50, 20,10,20,10}; // Example heights
        int K = 3; // Maximum jump distance
        int n = heights.length;

        int minCost = frogJumpK(heights, n, K);
        System.out.println("Minimum cost to reach the last stone: " + minCost);
    }

    public static int frogJumpK(int[] heights, int n, int K) {
        // Initialize dp array with a large value
        int[] dp = new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0; // Starting at stone 0, so no cost

        // Calculate minimum cost for each stone
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= K; j++) {
                if (i + j < n) {
                    dp[i + j] = Math.min(dp[i + j], dp[i] + Math.abs(heights[i] - heights[i + j]));
                }
            }
        }

        // Return the minimum cost to reach the last stone
        return dp[n - 1];
    }
}
