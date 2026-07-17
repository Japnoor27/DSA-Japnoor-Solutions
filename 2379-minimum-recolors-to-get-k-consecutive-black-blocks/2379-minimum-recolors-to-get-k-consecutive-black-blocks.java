class Solution {
    public int minimumRecolors(String blocks, int k) {
       int count_W=0,min=Integer.MAX_VALUE,left=0;
       for(int i=0;i<blocks.length();i++){
        if(blocks.charAt(i)=='W')
        count_W++;
       
       if(i-left+1>k){
        if(blocks.charAt(left)=='W'){
            count_W--;
        }
        left++;
       }
       if(i-left+1==k){
        min=Math.min(min,count_W);
       }}
       return min;
    }
}