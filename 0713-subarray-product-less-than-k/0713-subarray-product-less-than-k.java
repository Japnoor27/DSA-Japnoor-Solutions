class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
           if(k<=1) return 0;
        int count=0;
        int left=0;
        int prod=1;
        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
        while(prod>=k){
                prod/=nums[left];
                left++;
            }
            if(prod<k){
                count+=i-left+1;
            }
        }
        return count;
    }
}