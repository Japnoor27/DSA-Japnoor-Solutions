class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> st=new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int maxstreak=0;
        for(int num:st){
            if(!st.contains(num-1)){
                int currnum=num;
                int currStreak=1;
                while(st.contains(currnum+1)){
                    currStreak++;
                    currnum++;
                }
                maxstreak=Math.max(maxstreak,currStreak);
            }
        }
return maxstreak;
    }
}