package com.dsa.leetcode;

// https://leetcode.com/problems/maximum-matrix-sum/description/
public class MaximumMatrixSum {
    public static void main(String[] args) {
        // Example:
        // Input matrix:
        // [
        //   [1, -1, 3],
        //   [-2, 4, -6],
        //   [7, -8, 9]
        // ]
        // Expected output: 45
        // Explanations:
        // Convert matrix elements such that the sum is maximized.
        // The sum is calculated as: |1| + |1| + |3| + |2| + |4| + |6| + |7| + |8| + |9| = 45.

        int[][] matrix = {
                {1, -1, 3},
                {-2, 4, -6},
                {7, -8, 9}
        };

        Solution solution = new Solution();
        long maxSum = solution.maxMatrixSum(matrix);
        System.out.println("Maximum Matrix Sum: " + maxSum); // Output should be 45
    }
}

class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int negCnt = 0;
        int minValue = Integer.MAX_VALUE;
        long sum = 0;

        // Iterate over each element in the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                // Count negative numbers
                if (matrix[i][j] < 0) {
                    negCnt++;
                }
                // Keep track of the smallest absolute value
                minValue = Math.min(minValue, Math.abs(matrix[i][j]));
                // Sum the absolute values of all elements
                sum += Math.abs(matrix[i][j]);
            }
        }

        // If there are an odd number of negative numbers, adjust the sum
        return negCnt % 2 == 0 ? sum : sum - (2 * minValue);
    }
}




// Solution : we need to find max sum and we can change sign of adjacent node means
//            if count of negative number is even then answer is sum and
//            if count of negative number is odd then we have to subtract that with the 2*minValue