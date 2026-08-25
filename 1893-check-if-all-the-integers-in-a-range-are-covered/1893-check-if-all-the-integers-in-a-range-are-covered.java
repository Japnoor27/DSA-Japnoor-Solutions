class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff=new int[52];
        for(int[]r:ranges){
            int start=r[0];
            int end=r[1];
            diff[start]+=1;
            diff[end+1]-=1;
        }
        int curr=0,ans=0;
        for(int i=0;i<diff.length;i++){
            curr+=diff[i];
            if(i>=left && i<=right &&curr<=0) return false;;
        }
        return true;
    }
}