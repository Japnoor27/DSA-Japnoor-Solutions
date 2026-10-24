class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        int left=0;
      long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=maxK && nums[i]>=minK){
                 count+=i-left+1;
            }
            else{
                left=i+1;
            }
           
        }
        return count;
    }
}