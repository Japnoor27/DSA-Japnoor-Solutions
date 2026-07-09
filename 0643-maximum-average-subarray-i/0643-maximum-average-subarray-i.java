class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left=0;
        double sum=0;
        double max_avg = Double.NEGATIVE_INFINITY;
        if(nums.length<k) return nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i-left+1>k){
                sum-=nums[left];
                left++;
            }
            if(i-left+1==k){
                max_avg=Math.max(max_avg,sum/k);

            }

        }
        return max_avg;
    }
}