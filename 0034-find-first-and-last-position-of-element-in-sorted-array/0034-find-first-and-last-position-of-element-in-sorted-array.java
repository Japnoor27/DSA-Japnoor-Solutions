class Solution {
    public int[] searchRange(int[] nums, int target) {
        int found_f=-1;
        int found_s=-1;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                found_f=i;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(nums[j]==target){
                found_s=j;
            }
        }
        return new int[]{found_s,found_f};
    }
}