class Solution {
    public int countSubstrings(String s) {
        int count=0;
          ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                boolean flag=true;
                String sub=s.substring(i, j + 1);
                int st=0,e=sub.length()-1;
                while(st<=e){
                    if(sub.charAt(st)!=sub.charAt(e)){
                        flag=false;
                        break;
                    }
                    st++;
                    e--;
                    
                }
                 if(flag==true){
                    count++;
                }
               
            }
        }
        return count;
        
    }
}