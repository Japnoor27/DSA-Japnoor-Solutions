class Solution {
    public boolean canJump(int[] nums) {
        int maxind=0;
        for(int i=0;i<nums.length;i++){
            if(maxind>nums.length) return true;
            if(maxind < i)return false;
            maxind =Math.max(maxind,nums[i]+i);
        }
        return true;
    }
}