class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff=new int[101];
        for(int l[]:logs){
            int birth=l[0];
            int death=l[1];
            diff[birth-1950]+=1;
            diff[death-1950]-=1;
        }
        int curr=0,max=0,ans=0;
        for(int i=0;i<diff.length;i++){
curr+=diff[i];
if(curr>max){
    max=curr;
    ans=1950+i;
}
        }
        return ans;
    }
}