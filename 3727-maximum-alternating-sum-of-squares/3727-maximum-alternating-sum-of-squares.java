class Solution {
    public long maxAlternatingSum(int[] nums) {
       int n=nums.length;
       for(int i=0;i<n;i++){
        if(nums[i]<0){
            nums[i]=-nums[i];
        }
       }
       int[] arr=new int[n];
       int s=0;
       int e=n-1;
       Arrays.sort(nums);
       for(int i=0;i<n;i++){
        if(i%2==0){
arr[i]=nums[e--];
        }
        else{
            arr[i]=nums[s++];
        }
       }
       long sum=0;
       for(int i=0;i<n;i++){
if(i%2==0){
    sum+=(arr[i]*arr[i]);
}
else{
    sum-=(arr[i]*arr[i]);  
}
       }
       return sum;
    }
}