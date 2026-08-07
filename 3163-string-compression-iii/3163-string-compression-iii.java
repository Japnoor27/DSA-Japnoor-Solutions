class Solution {
    public String compressedString(String word) {
        int i=0;
        StringBuilder sb=new StringBuilder();
        while(i<word.length()){
            char ch=word.charAt(i);
            int count=1;
            while(i+1<word.length() && word.charAt(i+1)==ch && count<9){
                count++;
                i++;
            }
            sb.append(count);
            sb.append(ch);
            i++;
        }
        return sb.toString();
    }
}