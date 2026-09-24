class Solution {
    public int smallestIndex(int[] nums) {
       
        for(int i=0;i<nums.length;i++){
             int sum=0;
            int num=nums[i];
            while(num!=0){
                int rem=num%10;
                sum+=rem;
                num=num/10;
            }
            if(sum==i){
return i;
            }
        }
        return -1;
    }
}