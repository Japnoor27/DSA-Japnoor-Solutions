class Solution {
    public int countRotations(String s, int k) {
      
        int count2=0;
        for(int i=0;i<s.length();i++){
            String r="";
        int count=0;
            r=s.substring(i)+s.substring(0,i);
            for(int j=1;j<r.length();j++){
                if(r.charAt(j-1)==r.charAt(j))count++;;
                
            }
            if(count==k) count2++;
        }
return count2;
    }
}