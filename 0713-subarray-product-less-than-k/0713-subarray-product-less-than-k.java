class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left=0,count=0,product=1;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            while(product>=k){
                product=product/nums[left];
                left++;
            }
            if(product<k){
                count=count+i-left+1;
            }
        }
        return count;
    }
}