class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map <Integer,Integer> mp=new HashMap<>();
        int [] ans={-1};
        for(int i=0;i<n;i++){
            int val=target-nums[i];
            if(mp.containsKey(val)){
                ans=new int[] {i,mp.get(val)};
                return ans;
            }
            mp.put(nums[i],i);
        }

return ans;
    }
}