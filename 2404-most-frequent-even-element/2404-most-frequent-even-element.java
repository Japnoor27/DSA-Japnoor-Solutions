class Solution {
    public int mostFrequentEven(int[] nums) {
        TreeMap <Integer,Integer> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
        }
        int num=-1;
        int max=Integer.MIN_VALUE;
        for(int x:map.values()){
            max=Math.max(max,x);
        }
        for(int x:map.keySet()){
            if(map.get(x)==max){
                return x;
            }
        }
        return num;
    }
}