class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,zeroes=0,maxlen=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zeroes++;
            if(zeroes>k){
                if(nums[l]==0){
                    zeroes--;
                }
                l++;
            }
            maxlen=Math.max(maxlen,i-l+1);
        }
        return maxlen;
    }
}