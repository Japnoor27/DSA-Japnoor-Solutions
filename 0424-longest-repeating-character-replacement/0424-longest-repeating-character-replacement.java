class Solution {
    public int characterReplacement(String s, int k) {
        int chg=0,left=0,maxfreq=0,window=0,maxlen=0;
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            maxfreq=Math.max(maxfreq,map.get(s.charAt(i)));
            window=i-left+1;
            chg=window-maxfreq;
            if(chg>k){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }

maxlen=Math.max(i-left+1,maxlen);
        }
        return maxlen;
            }
}