class Solution {
    public int helper(int i,int j,String text1,String text2,int[][]dp){
        if(i==text1.length() || j==text2.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(text1.charAt(i)==text2.charAt(j)) {
            return dp[i][j]=1+helper(i+1,j+1,text1,text2,dp);
        }
        int a=helper(i+1,j,text1,text2,dp);
        int b=helper(i,j+1,text1,text2,dp);
        return dp[i][j]=Math.max(a,b);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,text1,text2,dp);
    }
}