class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) {
                nums[i]=-nums[i];
                k--;
                if(k==0) break;
            }
        }
    if(k%2==1)

    {
        int min_idx = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[min_idx]) {
                min_idx = i;
            }

        }
        nums[min_idx]=-nums[min_idx];}
        int sum=0;
        for(int num:nums)sum+=num;
        return sum;
    }
}