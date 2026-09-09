class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int half=n/2;
        int firstsum=0;
        int secondsum=0;
        int total=0;
        int count=0;
        for(int i=0;i<n;i++){
            total+=nums[i];
            if(i<half){
                firstsum+=nums[i];
            }
        }
        for(int k=0;k<n;k++){
            secondsum=total-firstsum;
            if(firstsum>secondsum)count++;
            firstsum-=nums[k];
            firstsum+=nums[(k+half)%n];
        }
        return count;
    }
}