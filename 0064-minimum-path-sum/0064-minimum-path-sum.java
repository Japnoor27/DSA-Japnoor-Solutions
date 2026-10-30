class Solution {
    public int helper(int i,int j,int[][]grid,int[][]dp){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || j>=n) return Integer.MAX_VALUE;
        if(i==m-1&& j==n-1) return grid[i][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int right=helper(i,j+1,grid,dp);
        int down=helper(i+1,j,grid,dp);
        return dp[i][j]=grid[i][j]+Math.min(right,down);
    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
    }
    return helper(0,0,grid,dp);

        
    }
}