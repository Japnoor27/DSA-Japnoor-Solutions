class Solution {
    public int jump(int[] nums) {
        int end=0,jump=0,far=0;
        for(int i=0;i<nums.length-1;i++){
            far=Math.max(far,nums[i]+i);
            if(i==end){
                jump++;
                end=far;
            }
        }
        return jump;
    }
}