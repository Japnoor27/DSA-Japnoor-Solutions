class Solution {
    public String countAndSay(int n) {
        String s="1";
        if(n==1) return "1";
        
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder();
        int k=0;
            while(k<s.length()){
            int count=1;
            while(k+1<s.length() && s.charAt(k)==s.charAt(k+1)){
                count++;
                k++;
            }
            sb.append(count);
            sb.append(s.charAt(k));
            k++;
        }
        s=sb.toString();
        }
        return s;
    }
}