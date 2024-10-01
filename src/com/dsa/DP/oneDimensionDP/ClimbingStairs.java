package com.dsa.DP.oneDimensionDP;

import java.util.Scanner;

public class ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        // Example:
        // Input: n = 5
        // The number of ways to climb to the 5th step is 8.
        // Explanation: You can climb 1 or 2 steps at a time. The distinct ways to reach the 5th step are:
        // 1. 1 + 1 + 1 + 1 + 1
        // 2. 1 + 1 + 1 + 2
        // 3. 1 + 1 + 2 + 1
        // 4. 1 + 2 + 1 + 1
        // 5. 2 + 1 + 1 + 1
        // 6. 1 + 2 + 2
        // 7. 2 + 1 + 2
        // 8. 2 + 2 + 1

        // Calling the function to calculate the number of ways to climb stairs
        System.out.println("Number of ways to climb stairs: " + climbStairs(n));
    }

    // Function to calculate the number of ways to climb stairs using dynamic programming
    public static int climbStairs(int n) {
        if (n == 0 || n == 1) return 1; // Base case: If there are 0 or 1 steps, there's only one way to climb.

        int[] dp = new int[n + 1]; // dp array to store the number of ways to climb each step
        dp[0] = 1; // There's one way to stay at step 0 (by doing nothing)
        dp[1] = 1; // There's one way to climb to step 1

        // Filling the dp array for each step
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2]; // Number of ways to reach step i is the sum of ways to reach step i-1 and i-2
        }

        return dp[n]; // Return the number of ways to reach the nth step
    }
}
