class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap <String,String> map=new HashMap<>();
        String temp="";
        boolean flag=false;
          StringBuilder sb=new StringBuilder();
        for(List<String> l:knowledge){
            map.put(l.get(0),l.get(1));
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                flag=true;
                sb=new StringBuilder();

            }
            else if(ch==')'){
                flag=false;
              if(map.containsKey(sb.toString())){
                 String word= map.get(sb.toString());
               temp+=word;
              }
              else{
                temp+="?";
              }
            }
            else{
                if(flag==true){
sb.append(ch);
                }
                else{
temp+=ch;
                }
              
            }
        }
        return temp;
    }
}