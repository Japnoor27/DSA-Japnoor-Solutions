class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int maxlen=0;
        int maxfreq=0;
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxfreq=Math.max(maxfreq,freq[s.charAt(i)-'A']);
            if(i-left+1-maxfreq>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            if(i-left+1-maxfreq<=k){
                maxlen=Math.max(maxlen,i-left+1);

            }

        }
        return maxlen;
    }
}