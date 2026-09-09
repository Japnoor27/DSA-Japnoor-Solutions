class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefixmax=new int[n];
        int[] sufixmin=new int[n];
        int ans=Integer.MAX_VALUE;
        prefixmax[0]=nums[0];
        for(int i=1;i<n;i++){
            prefixmax[i]=Math.max(prefixmax[i-1],nums[i]);
        }
        sufixmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            sufixmin[i]=Math.min(sufixmin[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if((prefixmax[i]-sufixmin[i])<=k){
                ans=Math.min(ans,i);
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}