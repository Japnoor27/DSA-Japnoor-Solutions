class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mag=new HashMap<>();
        HashMap<Character,Integer> ran=new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            ran.put(ch,ran.getOrDefault(ch,0)+1);
        }
         for(char ch:magazine.toCharArray()){
            mag.put(ch,mag.getOrDefault(ch,0)+1);
        }
        for(char key:ran.keySet()){
            // if(!mag.containsKey(key)){
            //     return false;
            // }
            if(!mag.containsKey(key) || ran.get(key)>mag.get(key)){
                return false;
            }
        }
        return true;
        

        
    }
}