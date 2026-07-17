class Solution {
    public int longestContinuousSubstring(String s) {
        int max=1,left=0;
        for(int i=1;i<s.length();i++){
            if((s.charAt(i)+'0')-(s.charAt(i-1)+'0')!=1){
                left=i;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}