class Solution {
    public int longestPalindrome(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        boolean flag=false;
        int count=0;
        for(char x:map.keySet()){
            if(map.get(x)%2==0) count+=map.get(x);
            else{
           count+=map.get(x)-1;
                flag=true;
            }
        }
        if(flag)count+=1;
        return count;
    }
}