class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,zeroes=0,ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes++;
            if(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;
    }
}