class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        char[] arr=s.toCharArray();
        int st=0,e=s.length()-1;
        while(st<e){
            char temp=arr[st];
            arr[st]=arr[e];
            arr[e]=temp;
            st++;
            e--;
        }
        return String.valueOf(arr).equals(s);    }
}