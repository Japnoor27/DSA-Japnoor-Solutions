class Solution {
    public String reverseVowels(String s) {
    String str="";
    StringBuilder sb=new StringBuilder(); 
    int n=s.length();
    for(int i=n-1;i>=0;i--){
        char ch=s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
    str+=ch;
}
    }
    int j=0;
for(int i=0;i<n;i++){
    char ch=s.charAt(i);
   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
    sb.append(str.charAt(j));
    j++;
   }
   else{
    sb.append(ch);
   }
}
return sb.toString();
    }
}