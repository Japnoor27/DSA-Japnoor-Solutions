class Solution {
    public String shortestPalindrome(String s) {
        String rev=new StringBuilder(s).reverse().toString();
        String temp=s+'#'+rev;
        int i=1,n=temp.length(),len=0;
        int[] lps=new int[n];
        while(i<n){
            if(temp.charAt(i)==temp.charAt(len)){
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
        int palprefix=lps[n-1];
        String rem=s.substring(palprefix);
        String ans=new StringBuilder(rem).reverse().toString();
        return ans+s;

    }
}