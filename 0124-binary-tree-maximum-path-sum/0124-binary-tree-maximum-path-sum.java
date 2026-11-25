class Solution {
    int maxi = Integer.MIN_VALUE;

    public int solve(TreeNode root) {
        if (root == null) return 0;

        int l = Math.max(0, solve(root.left));
        int r = Math.max(0, solve(root.right));

        maxi = Math.max(maxi, root.val + l + r);

        return root.val + Math.max(l, r);
    }

    public int maxPathSum(TreeNode root) {
        solve(root);
        return maxi;
    }
}