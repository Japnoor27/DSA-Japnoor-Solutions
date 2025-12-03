class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum_nos=0;
        int sum_ind=n*(n+1)/2;
        for(int i=0;i<n;i++){
            sum_nos+=nums[i];
        }
        return sum_ind-sum_nos;
    }
}