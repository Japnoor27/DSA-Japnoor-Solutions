class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] prefixmax=new int[n];
        int[] suffixmin=new int[n];
        prefixmax[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixmax[i]=Math.max(prefixmax[i-1],nums[i]);
        }
        suffixmin[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffixmin[i]=Math.min(suffixmin[i+1],nums[i]);
        }
        int ans=Integer.MAX_VALUE;
for(int i=0;i<n;i++){
    if((prefixmax[i]-suffixmin[i])<=k) {
        ans=Math.min(ans,i);
    }
}
if(ans==Integer.MAX_VALUE) return -1;
return ans;
    }
}