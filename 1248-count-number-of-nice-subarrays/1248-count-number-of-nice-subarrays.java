class Solution {
    public int atMost(int nums[],int k){
 if (k < 0) return 0;
        int left=0,count=0,sum=0;
        for(int i=0;i<nums.length;i++){
        sum+=nums[i]%2;
        while(sum>k){
            sum-=nums[left]%2;
            left++;

        }
        count+=i-left+1;}
        return count;
       }
    public int numberOfSubarrays(int[] nums, int k) {
      return atMost(nums,k)-atMost(nums,k-1);
    }
}