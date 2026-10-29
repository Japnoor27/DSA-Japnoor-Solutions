class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
     int val=0,ans=0,count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
if(mat[i][j]==1){
   count++;
}
if(ans<count){


ans=Math.max(ans,count);
val=i;}
            }
            count=0;
        }
        return new int[]{val,ans};
    }
}