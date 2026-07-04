class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap <Character,Character> map=new HashMap <>();
         HashMap <Character,Character> map2=new HashMap <>();
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
                if(map.containsKey(ch1)){
                    if(ch2!=map.get(ch1)){
                    return false;}
                    
                }
                else{
                    map.put(ch1,ch2);

                }
            }
            for(int i=0;i<s.length();i++){
                char ch1=s.charAt(i);
                char ch2=t.charAt(i);
                if(map2.containsKey(ch2)){
                    if(ch1!=map2.get(ch2)){
                        return false;
                    }
                }
                else{
                    map2.put(ch2,ch1);
                }
            
        }
        return true;
    }
}