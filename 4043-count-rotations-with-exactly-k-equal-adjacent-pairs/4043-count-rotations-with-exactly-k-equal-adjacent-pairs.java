class Solution {
    public int countRotations(String s, int k) {
        int count2=0;
        for(int j=0;j<s.length();j++){
             int count1=0;
            
            String str=s.substring(j)+s.substring(0,j);
            for(int i=0;i<str.length()-1;i++){
                if(str.charAt(i)==str.charAt(i+1)) count1++;
            }
            if(count1==k) count2++;
            
        }
        return count2;
    }
}