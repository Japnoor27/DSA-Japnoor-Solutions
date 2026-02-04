class Solution {
    public String removeKdigits(String num, int k) {
        Stack <Character> st=new Stack <>();
        int n=num.length();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && k>0 && (st.peek()-'0')>(num.charAt(i)-'0')){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        while(k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty()) return "0";
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        int idx=0;
        while(idx<sb.length() && sb.charAt(idx)=='0' ){
            idx++;
        }
        String res=sb.substring(idx);
        if(res.length()==0){
            return "0";
        }
        else{
            return res;
        }
    }
}