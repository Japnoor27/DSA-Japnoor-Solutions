class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int left=0;
        long count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count+=i-left+1;
            }
            if( nums[i]!=0){
                left=i+1;
            }
        }
        return count;
    }
}