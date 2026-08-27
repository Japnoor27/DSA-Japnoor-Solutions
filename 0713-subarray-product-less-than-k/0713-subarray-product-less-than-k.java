class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0,prod=1,left=0;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            while(prod>=k){
                prod=prod/nums[left];
                left++;

            }
            if(prod<k) count+=i-left+1;
        }
        return count;
    }
}