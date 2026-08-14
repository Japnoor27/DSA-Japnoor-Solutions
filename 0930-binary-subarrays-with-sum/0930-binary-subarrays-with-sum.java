class Solution {
public int atMost(int[] nums,int goal){
    int sum=0,left=0,count=0;
    if(goal<0) return 0;
    for(int i=0;i<nums.length;i++){
        sum+=nums[i];
        while(sum>goal){
            sum-=nums[left];
            left++;
        }
        count+=i-left+1;
    }
    return count;
}
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
}