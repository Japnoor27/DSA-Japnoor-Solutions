class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        if (t.length() == 0) return "";
        int freq[] =new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        }
        int count=t.length();
        int left=0;
        int start=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;
            while(count==0){
                int len=i-left+1;
                if(len<min){
                    min=len;
                    start=left;
                }
                char c=s.charAt(left);
                freq[c]++;
                if(freq[c]>0){
                    count++;
                }
                left++;
            }
        }
        if(min==Integer.MAX_VALUE)return "";
        return s.substring(start,start+min);
    }
}