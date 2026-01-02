class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        char[] arr=s.toCharArray();
        int st=0,e=s.length()-1;
        boolean flag=true;
        while(st<e){
          if(s.charAt(st)!=s.charAt(e)){
            flag=false;
            break;
          }
          st++;
          e--;
        }
        return flag;    }
}