class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] prefixsum=new int[nums.length];
        int[] sufixsum=new int[nums.length];
        prefixsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefixsum[i]=Math.max(nums[i],prefixsum[i-1]);
        }
        sufixsum[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            sufixsum[i]=Math.min(nums[i],sufixsum[i+1]);
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if((prefixsum[i]-sufixsum[i])<=k){
                ans=Math.min(ans,i);
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return ans;
    }
}