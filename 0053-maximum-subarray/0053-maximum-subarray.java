class Solution {
    public int maxSubArray(int[] nums) {
        // int maxsum = nums[0];
        // int sum = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     sum += nums[i];
        //     maxsum = Math.max(sum, maxsum);
        //     if (sum < 0)
        //         sum = 0;

        // }
        // return maxsum;
           int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}