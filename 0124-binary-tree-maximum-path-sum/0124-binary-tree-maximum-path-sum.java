/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxi=Integer.MIN_VALUE;
    public int solve(TreeNode root){
        if (root==null) return 0;
        int l=solve(root.left);
        int r=solve(root.right);
        if(l<0 ) l=0;
        if(r<0) r=0;
        maxi=Math.max(maxi,l+r+root.val);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxi;
    }
}