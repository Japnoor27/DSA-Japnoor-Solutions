class Solution {
    public int gcd(int i,int j){
if(j==0) return i;
return gcd(j,i%j);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int i=nums[0];
        int j=nums[nums.length-1];
        return gcd(i,j);
    }
}