class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxi=Arrays.stream(nums).max().getAsInt();
        int sum=0;
        for(int i=1;i<=k;i++){
sum+=maxi;
maxi+=1;
        }
        return sum;
    }
}