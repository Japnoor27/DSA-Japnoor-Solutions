class Solution {
    public boolean isAnagram(String s, String t) {
        // Map <Character,Integer> mp=new HashMap <>();
        // Map <Character,Integer> mp2=new HashMap <>();
        // if(s.length()!=t.length()) return false;
        // for(int i=0;i<s.length();i++){
        //     Character ch=s.charAt(i);
        //    if(mp.containsKey(ch)){
        //     mp.put(ch,mp.get(ch)+1);
        //    }
        //    else{
        //     mp.put(ch,1);
        //    }
        // }
        // for(int i=0;i<t.length();i++){
        //   Character ch=t.charAt(i);
        //    if(mp2.containsKey(ch)){
        //     mp2.put(ch,mp2.get(ch)+1);
        //    }
        //    else{
        //     mp2.put(ch,1);
        //    }
        // }
        // return mp.equals(mp2);
        Map <Character,Integer> mp=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            Character ch=s.charAt(i);
           if(mp.containsKey(ch)){
            mp.put(ch,mp.get(ch)+1);
           }
           else{
            mp.put(ch,1);
           }
        }
        for(int i=0;i<t.length();i++){
            Character ch=t.charAt(i);
           if(mp.containsKey(ch)){
            mp.put(ch,mp.get(ch)-1);
           }
           else{
            mp.put(ch,1);
           }
        }
        for(var e:mp.values()){
            if(e!=0){
                return false;
            }
        }
        return true;
    }
}