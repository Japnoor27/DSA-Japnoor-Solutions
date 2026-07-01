class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap <Character,Integer> map=new HashMap <>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(char ch:t.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
            }
            else{
                return false;
            }
            
        }
        for(char ch:map.keySet()){
            if(map.get(ch)!=0){
                return false;
            }
        }
        return true;
    }
}