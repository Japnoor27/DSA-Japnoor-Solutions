class Solution {
    public int numberOfSubstrings(String s) {
        int[] list=new int[3];
        Arrays.fill(list,-1);
        int count=0;
        for(int i=0;i<s.length();i++){
            list[s.charAt(i)-'a']=i;
            if(list[0]!=-1 && list[1]!=-1 && list[2]!=-1){
                count+=1+Math.min(list[0],Math.min(list[1],list[2]));
            }
        }
        return count;
    }
}