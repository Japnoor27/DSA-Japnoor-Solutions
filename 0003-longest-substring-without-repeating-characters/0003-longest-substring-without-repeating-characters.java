class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        int left=0,ans=0;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                left=Math.max(left,map.get(s.charAt(i))+1);

            }
            map.put(s.charAt(i),i);

            
            ans=Math.max(i-left+1,ans);
        }
        return ans;
    }
}