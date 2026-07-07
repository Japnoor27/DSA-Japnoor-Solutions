class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
    HashMap <Integer,Integer> map=new HashMap <>();
    for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
    }
    for(Integer num:map.keySet()){
        if(map.get(num)>n/2){
            return num;
        }

    }
    return -1;
 
    }
}