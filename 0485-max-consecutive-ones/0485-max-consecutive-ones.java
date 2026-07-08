class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
int left=0;
int maxlen=0;
for(int i=0;i<nums.length;i++){
    
    if(nums[i]==0){
        left=i+1;
    }
    maxlen=Math.max(maxlen,i-left+1);

}
return maxlen;
    }
}