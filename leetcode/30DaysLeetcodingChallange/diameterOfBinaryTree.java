package trainingQuestions.leetcode.30DaysLeetcodingChallange;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        int rootPathDiameter = treeHeight(root.left) + treeHeight(root.right);
        int leftTreeDiameter = diameterOfBinaryTree(root.left);
        int rightTreeDiameter = diameterOfBinaryTree(root.right);
        
        return Math.max(rootPathDiameter, Math.max(leftTreeDiameter, rightTreeDiameter));
    }
    
    public int treeHeight(TreeNode root){
        if(root == null) return 0;
        
        return Math.max(treeHeight(root.left), treeHeight(root.right))+1;
    }
}