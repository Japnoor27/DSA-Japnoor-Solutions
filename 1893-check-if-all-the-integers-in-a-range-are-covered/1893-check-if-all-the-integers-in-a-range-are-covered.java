class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] diff=new int[52];
        for(int[] r:ranges){
            int lefti=r[0];
            int righti=r[1];
            diff[lefti]+=1;
            diff[righti+1]-=1;
        }
        int curr=0;
        for(int i=0;i<diff.length;i++){
            curr+=diff[i];
            if(i>=left &&i<=right && curr==0) return false;
        }
        return true;
    }
}