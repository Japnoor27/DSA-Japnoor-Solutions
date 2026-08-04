class Solution {
    public int compress(char[] chars) {
        int i=0,k=0;
        while(i<chars.length){
            char ch=chars[i];
            int count=1;
            while(i+1<chars.length&& chars[i]==chars[i+1]){
                count++;
                i++;
            }
            chars[k++]=ch;
            if(count>1){
                String s=String.valueOf(count);
                for(char c:s.toCharArray()){
                    chars[k++]=c;
                }
            }
            i++;
        }
        return k;
    }
}