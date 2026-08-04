class Solution {
    public int singleNumber(int[] nums) {
        HashMap <Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int x:map.keySet()){
            if(map.get(x)==1){
                return x;
            }
        }
        return -1;
    }
}