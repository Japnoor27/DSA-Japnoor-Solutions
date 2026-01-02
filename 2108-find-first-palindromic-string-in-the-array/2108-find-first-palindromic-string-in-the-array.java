class Solution {
    public String firstPalindrome(String[] words) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            boolean flag=true;
            String s=words[i];
            int st=0,e=s.length()-1;
            while(st<=e){
                if(s.charAt(st)!=s.charAt(e)){
                    flag=false;
                    break;
                }
                st++;
                e--;
            }
            if(flag==true){
                sb.append(words[i]);
                break;
            }
        }
        return sb.toString();
    }
}