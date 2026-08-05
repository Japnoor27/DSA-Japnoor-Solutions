class Solution {
long max=0;
    public int gcd(int i,int j){
        if(j==0) return i;
        return gcd(j,i%j);
    }
    public long maxPairStrength(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long g= gcd(nums[i], nums[j]);
                long ans=((1L*nums[i] * nums[j]) /(g*g));
                max=Math.max(max,ans);
            }
        }
        return max;
    }
}