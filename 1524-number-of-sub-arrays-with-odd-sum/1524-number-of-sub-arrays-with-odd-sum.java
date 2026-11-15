class Solution {
    public int numOfSubarrays(int[] arr) {
        int MOD=1000000007;
        
        int even=1;
        int odd=0;
        long sum=0;
        long count=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum%2==0){
                count+=odd;
                even++;

            }
            else{
                count+=even;
                odd++;
            }
        }

        return (int)(count%MOD);
    }
}