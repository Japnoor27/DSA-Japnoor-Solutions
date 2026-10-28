class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer,Integer> map=new HashMap<>();
        int found1=0,found2=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                found1=i;
                found2=map.get(nums[i]);
                if(Math.abs(found1-found2)<=k) return true;
                map.put(nums[i],i);
            }
            else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}