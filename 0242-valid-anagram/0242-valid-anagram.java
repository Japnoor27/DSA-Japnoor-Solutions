class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
int ind=ch-'a';
freq[ind]++;
        }
         for(char ch:t.toCharArray()){
int ind=ch-'a';
freq[ind]--;
        }
        for(int num:freq){
            if(num!=0) return false;
        }
        return true;
    }
}