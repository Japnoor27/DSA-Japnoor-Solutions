class Solution {
    public boolean isIsomorphic(String s, String t) {
    //     if(s.length()!=t.length()) return false;
    //     Map <Character,Character> mp=new HashMap<>();
    //     for(int i=0;i<s.length();i++){
    //         Character sCh=s.charAt(i);
    //         Character tCh=t.charAt(i);
    //         if(mp.containsKey(sCh) ){
    //             if(mp.get(sCh)!=tCh){
    // return false;}
    //              }
            
    //         else{
    //             if(mp.containsValue(tCh)) return false;
    //     mp.put(sCh,tCh);
    //         }}
    //     return true;
    if(s.length()!=t.length()) return false;
    HashSet <Character> st=new HashSet <>();
        Map <Character,Character> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character sCh=s.charAt(i);
            Character tCh=t.charAt(i);
            if(mp.containsKey(sCh) ){
                if(mp.get(sCh)!=tCh){
    return false;}
                 }
            
            else{
                if(st.contains(tCh)) return false;
        mp.put(sCh,tCh);
        st.add(tCh);
            }}
        return true;
    }
}