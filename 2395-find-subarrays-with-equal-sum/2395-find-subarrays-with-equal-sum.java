class Solution {
    public boolean findSubarrays(int[] nums) {
        int left=0,sum=0;
        HashMap <Integer,Integer> map=new HashMap <>();
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(i-left+1>2){
                sum-=nums[left];
                left++;

            }
            if(i-left+1==2){
            map.put(sum,map.getOrDefault(sum,0)+1);}


        }
        for(int x:map.values()){
            if(x>1){
                return true;
            }
        }
        return false;

    }
}