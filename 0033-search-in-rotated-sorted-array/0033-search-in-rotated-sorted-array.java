class Solution {
    public int search(int[] nums, int target) {
        int found=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                found=i;
                break;
            }
        }
        return found;
    }
}