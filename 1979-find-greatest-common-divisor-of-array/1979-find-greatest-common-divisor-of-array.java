class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int num1=nums[0];
        int num2=nums[nums.length-1];
        return gcd(num1,num2);
    }
}