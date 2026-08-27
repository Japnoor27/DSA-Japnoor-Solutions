class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0,sum=0,min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=target){
                 min=Math.min(min,i-left+1);
                sum-=nums[left];
                left++;
            }
        
        }
           if(min==Integer.MAX_VALUE)return 0;
        return min;
    }
}