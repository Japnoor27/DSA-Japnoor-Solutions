class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
                while(map.get(ch)>2){
                    map.put(s.charAt(left),map.get(s.charAt(left))-1);
                    left++;
                }
                    max=Math.max(i-left+1,max);

        }
        return max;
    }
}