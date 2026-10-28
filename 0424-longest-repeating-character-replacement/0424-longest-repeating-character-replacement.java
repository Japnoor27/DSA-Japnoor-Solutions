class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,maxlen=0,chg=0,maxfreq=0;
        HashMap <Character,Integer> map=new HashMap <>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,map.get(ch));
    chg=(i-left+1)-maxfreq;
    if(chg>k){
       
        map.put(s.charAt(left),map.get(s.charAt(left))-1);
         left++;
    }
maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
    }
}