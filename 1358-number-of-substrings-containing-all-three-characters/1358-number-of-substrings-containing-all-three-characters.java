class Solution {
    public int numberOfSubstrings(String s) {
        int left=0,count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                count+=s.length()-i;
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                if(map.get(s.charAt(left))==0){
                    map.remove(s.charAt(left));
                    
                }
                left++;
            }


        }
        return count;
    }
}