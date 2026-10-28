class Solution {
    public String reverseWords(String s) {
        String[] arr=s.split(" ");
        String str="";
        for(int j=0;j<arr.length;j++){
            String word=arr[j];
            for(int i= word.length()-1;i>=0;i--){
                str+=word.charAt(i);
            }
            if(j<arr.length-1){
                str+=" ";
            }
            
            
        }
        return str;
    }
}