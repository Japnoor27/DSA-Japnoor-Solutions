class Solution {
      public int atMost(int[] nums,int k){
        if (k < 0) return 0;
        int left=0,count=0,sum=0;
        for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        while(sum>k){
            sum-=nums[left];
            left++;

        }
        count+=i-left+1;}
        return count;
    }
 
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);

         }
}