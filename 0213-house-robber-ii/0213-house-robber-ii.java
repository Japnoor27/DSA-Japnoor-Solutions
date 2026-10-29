class Solution {
    public int helper(int n,int start,int[] nums,int[] dp){
        if(n<start) return 0;
        if(dp[n]!=-1) return dp[n];
        int pick=nums[n]+helper(n-2,start,nums,dp);
        int notpick=helper(n-1,start,nums,dp);
        return dp[n]=Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        if(n==1) return nums[0];
        Arrays.fill(dp,-1);
        int case1=helper(n-2,0,nums,dp);
        Arrays.fill(dp,-1);
        int case2=helper(n-1,1,nums,dp);
        return Math.max(case1,case2);
    }
}