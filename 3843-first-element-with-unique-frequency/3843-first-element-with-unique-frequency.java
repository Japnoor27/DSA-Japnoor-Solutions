class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashMap<Integer,Integer> map2=new LinkedHashMap<>();
        for(int x:map.values()){
             map2.put(x,map2.getOrDefault(x,0)+1);
        }
        for(int x:nums){
            int num=map.get(x);
            if(map2.get(num)==1) return x;
        }
        return -1;
    }
}