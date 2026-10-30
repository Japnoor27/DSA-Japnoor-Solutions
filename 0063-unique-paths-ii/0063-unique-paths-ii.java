class Solution {
    public int helper(int i,int j,int[][]dp,int[][]grid){
        int m=grid.length;
        int n=grid[0].length;
        if(i>=m || j>=n) return 0;
        if(grid[i][j]==1) return 0;

        if(i==m-1 && j==n-1) return 1;
        
        if(dp[i][j]!=-1) return dp[i][j]; 
        int right=helper(i,j+1,dp,grid);
        int down=helper(i+1,j,dp,grid);
        return dp[i][j]=right+down;

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
          int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,dp,obstacleGrid);
    }
}