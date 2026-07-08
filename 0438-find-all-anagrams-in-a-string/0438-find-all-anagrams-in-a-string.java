class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int left=0;
        ArrayList <Integer> ans=new ArrayList <>();
        if(s.length()<p.length()) return ans;
        int[] sfreq=new int[26];
        int[] pfreq=new int[26];
        for(int i=0;i<p.length();i++){
            pfreq[p.charAt(i)-'a']++;

        }
        for(int i=0;i<s.length();i++){
            sfreq[s.charAt(i)-'a']++;
            if(i-left+1>p.length()){
                sfreq[s.charAt(left)-'a']--;
                left++;
            }
            if(i-left+1==p.length()){
                if(Arrays.equals(sfreq,pfreq)){
                    ans.add(left);

                }
            }
        }
        return ans;
    }
}