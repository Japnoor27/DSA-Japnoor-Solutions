class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] arr=new int[2];
        int[] freq=new int[n+1];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>1){
                arr[0]=i;
            }
            if(freq[i]==0){
                arr[1]=i;
            }
        }
        return arr;
    }
}