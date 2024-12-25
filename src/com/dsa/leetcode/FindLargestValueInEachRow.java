package com.dsa.leetcode;

//https://leetcode.com/problems/find-largest-value-in-each-tree-row/description/
public class FindLargestValueInEachRow {
}
//class Solution {
//    public List<Integer> largestValues(TreeNode root) {
//        List<Integer> ans = new ArrayList<>();
//        if(root==null) return ans;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//
//        while(!q.isEmpty()){
//            int size = q.size();
//            int maxValue = Integer.MIN_VALUE;
//            for(int i=0;i<size;i++){
//                TreeNode node = q.poll();
//                maxValue = Math.max(maxValue,node.val);
//
//                if(node.left!=null) q.add(node.left);
//                if(node.right!=null) q.add(node.right);
//            }
//            ans.add(maxValue);
//        }
//        return ans;
//    }
//}