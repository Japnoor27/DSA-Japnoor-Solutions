class Solution {
    public String findValidPair(String s) {
        HashMap <Character,Integer> map=new HashMap <>();
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<s.length()-1;i++){
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            if(ch1!=ch2 && ch1==map.get(ch1)+'0' && ch2==map.get(ch2)+'0'){
              
                return ""+ch1+ch2;
            }
        }
        return "";

    }
}