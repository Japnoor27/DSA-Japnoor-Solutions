class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")) return "0";
        int n=num1.length();
        int m=num2.length();
        int[] res=new int[n+m];
        for(int i=n-1;i>=0;i--){
            for(int j= m-1;j>=0;j--){
                int prod=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                prod+=res[i+j+1];
                res[i+j+1]=prod%10;
                res[i+j]=res[i+j]+prod/10;
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<res.length){
            if(res[i]!=0) break;
            else i++;
        }
        while(i<res.length){
            sb.append(res[i]);
            i++;
        }
        return sb.toString();
        }
    
}