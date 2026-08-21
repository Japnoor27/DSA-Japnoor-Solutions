class Solution {
    public boolean canJump(int[] nums) {
        int max_ind=0;
        for(int i=0;i<nums.length;i++){
            if(i>max_ind)return false;
            max_ind=Math.max(max_ind,nums[i]+i);
            if(max_ind>nums.length) return true;

        }
        return true;
    }
}