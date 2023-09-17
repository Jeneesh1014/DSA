package com.dsa.Array.Easy.Question8;

//Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
//
//        The union of two arrays can be defined as the common and distinct elements in the two arrays.
//        NOTE: Elements in the union should be in ascending order.
//
//        Example 1:
//        Input:
//        n = 5,m = 5.
//        arr1[] = {1,2,3,4,5}
//        arr2[] = {2,3,4,4,5}
//
//        Example 2:
//        Input:
//        n = 10,m = 7.
//        arr1[] = {1,2,3,4,5,6,7,8,9,10}
//        arr2[] = {2,3,4,4,5,11,12}
//        Output: {1,2,3,4,5,6,7,8,9,10,11,12}

import java.util.ArrayList;

public class Answer8 {
    public static void main(String[] args) {
       int  n = 10,m = 7;
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = {2,3,4,4,5,11,12};

        ArrayList<Integer> ans = FindUinon(arr1,arr2,n,m);
        System.out.println(ans);
    }

    private static ArrayList<Integer> FindUinon(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                    ans.add(arr1[i]);
                }
                i++;
            }else{
                if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                    ans.add(arr2[j]);
                }
                j++;
            }
        }

        while(i<n){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr1[i]){
                ans.add(arr1[i]);

            }
            i++;
        }

        while(j<m){
            if(ans.size()==0 || ans.get(ans.size()-1)!=arr2[j]){
                ans.add(arr2[j]);
            }
            j++;
        }
        return ans;
    }
}
