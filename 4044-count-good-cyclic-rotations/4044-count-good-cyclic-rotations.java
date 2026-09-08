class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int half=n/2;
        long total=0;
    long firstsum=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
            if(i<half){
                firstsum+=nums[i];
            }
        }
        long secondsum=0;
        int count=0;
        for(int k=0;k<n;k++){
            secondsum=total-firstsum;
            if(firstsum>secondsum)count++;
            firstsum-=nums[k];
            firstsum+=(nums[(k+half)%n]);
        }
        return count;
    }
}