class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] diff=new int[101];
        for(int[] l:logs){
            int birth=l[0];
            int death=l[1];
            diff[birth-1950]+=1;
            diff[death-1950]-=1;
        }
        int total=0,ans=0,max=0;
        for(int i=0;i<diff.length;i++){
            total+=diff[i];
            if(total>max){
                max=total;
                ans=1950+i;
            }

        }
        return ans;
    }
}