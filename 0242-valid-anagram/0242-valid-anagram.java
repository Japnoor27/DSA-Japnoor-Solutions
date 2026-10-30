class Solution {
    public boolean isAnagram(String s, String t) {
        int[] s_freq=new int[26];
        // int[] t_freq=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            s_freq[ch-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            s_freq[ch-'a']--;
        }
        for(int i=0;i<26;i++){
            if(s_freq[i]!=0) return false;
        }
        return true;
    }
}