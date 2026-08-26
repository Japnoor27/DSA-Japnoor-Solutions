class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums)set.add(num);
        int maxlen=0;
        for(int num:set){
            int curr=num;
            int currstreak=1;
            if(!set.contains(curr-1)){
                while(set.contains(curr+1)){
                    curr++;
                    currstreak++;
                }
            }
            maxlen=Math.max(maxlen,currstreak);
        }
        return maxlen;
    }
}