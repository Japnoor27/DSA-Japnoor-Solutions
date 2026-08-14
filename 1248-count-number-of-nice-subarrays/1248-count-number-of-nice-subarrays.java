class Solution {
    public int atMost(int[] nums,int k){
         int left=0,odd=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[left]%2!=0){
                    odd--;
                }
                left++;
            }
            count+=i-left+1;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
       return atMost(nums,k)-atMost(nums,k-1);
    }
}