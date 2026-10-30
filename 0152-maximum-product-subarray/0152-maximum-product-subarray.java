class Solution {
    public int maxProduct(int[] nums) {
        int max=Integer.MIN_VALUE,prod=1;
        for(int i=0;i<nums.length;i++){
            prod=1;
            for(int j=i;j<nums.length;j++){
                prod*=nums[j];
                            max=Math.max(prod,max);


            }
        }
        return max;
    }
}