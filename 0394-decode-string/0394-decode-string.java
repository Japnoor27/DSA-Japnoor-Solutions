class Solution {
    public String decodeString(String s) {
        Stack <Integer> st=new Stack<>();
        Stack <String> sta=new Stack<>();
        int num=0;
        String curr="";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                st.push(num);
                sta.push(curr);
                num=0;
                curr="";
            }
            else if(ch==']'){
                String temp="";
                int n=st.pop();
                String str=sta.pop();
                for(int j=0;j<n;j++){
                    temp+=curr;
                }
                curr=str+temp;
            }
            else if(Character.isLetter(ch)){
                curr+=ch;
            }
        }
return curr;
    }
}