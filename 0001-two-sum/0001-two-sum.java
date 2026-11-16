class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap<>();
    
        int ans1=-1,ans2=-1;
        for(int i=0;i<nums.length;i++){
        
        int diff=target-nums[i];
        if(map.containsKey(diff)){
            ans1=i;
            ans2=map.get(diff);
        }
        else{
            map.put(nums[i],i);
        }
        }
        return new int[]{ans1,ans2};
    }
}