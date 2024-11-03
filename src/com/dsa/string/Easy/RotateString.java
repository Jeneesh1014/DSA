package com.dsa.string.Easy;


// https://leetcode.com/problems/rotate-string/description/
public class RotateString {
    public static void main(String[] args) {
        RotateString solution = new RotateString();

        // Test cases
        System.out.println(solution.rotateString("abcde", "cdeab")); // Expected: true
        System.out.println(solution.rotateString("abcde", "abced")); // Expected: false
    }

    public boolean rotateString(String s, String goal) {
        // Check if lengths are different; if so, they can't be rotations.
        if (s.length() != goal.length()) {
            return false;
        }

        // Check each rotation
        String rotated = s;
        for (int i = 0; i < s.length(); i++) {
            // If rotated string matches goal, return true
            if (rotated.equals(goal)) {
                return true;
            }

            // Perform rotation: move the first character to the end
            rotated = rotated.substring(1) + rotated.charAt(0);
        }

        // If no rotation matched, return false
        return false;
    }
}