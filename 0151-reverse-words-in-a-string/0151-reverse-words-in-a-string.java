class Solution {
    public String reverseWords(String s) {
        s=s.trim().replaceAll("\\s+"," ");
        String[] arr=s.split(" ");
        int st=0,e=arr.length-1;
        while(st<=e){
            String temp=arr[st];
            arr[st]=arr[e];
            arr[e]=temp;
            st++;
            e--;
        }
        return String.join(" ",arr);
    }
}