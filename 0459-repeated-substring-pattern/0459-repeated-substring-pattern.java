class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i=1;
        int n=s.length();
        int len=0;
        int[] lps=new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i]=0;
                    i++;
                }
            }
        }
        int check=n-lps[n-1];
        if(n%check==0 && lps[n-1]!=0) return true;
        return false;
    }
}