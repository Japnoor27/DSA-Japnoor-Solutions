class Solution {
    public boolean isVowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        HashMap <String,Integer> map=new HashMap <>();
        int left=0;
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
          if(isVowel(s.charAt(i))){
            count++;
          }
          if(i-left+1>k){
            if(isVowel(s.charAt(left))){
                count--;
            }
                            left++;

          }
          if(i-left+1==k){
            max=Math.max(max,count);
          }
            
        }
        return max;
    }

}