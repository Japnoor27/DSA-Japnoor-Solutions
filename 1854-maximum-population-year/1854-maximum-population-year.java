class Solution {
    public int maximumPopulation(int[][] logs) {
       int[] diff=new int[101];
       for(int year[]:logs){
int birth=year[0];
int death=year[1];
diff[birth-1950]+=1;
diff[death-1950]-=1;
       }
       int max=0,ans=0,total=0;
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