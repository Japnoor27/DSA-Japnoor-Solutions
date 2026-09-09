class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Arrays.stream(nums).max().getAsInt();
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+max;
            max++;

        }
        return sum;
    }
}