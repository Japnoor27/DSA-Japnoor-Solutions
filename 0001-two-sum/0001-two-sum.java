class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap <>();
        int ans=-1,ans1=-1;
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(map.containsKey(diff)){
                ans=i;
                ans1=map.get(diff);

            }
            map.put(nums[i],i);
        }
        return new int[]{ans1,ans};
    }
}