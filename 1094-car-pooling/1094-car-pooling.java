class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff=new int[1001];
        for(int[] t:trips){
            int pass=t[0];
            int start=t[1];
            int end=t[2];
            diff[start]+=pass;
            diff[end]-=pass;

        }
        int curr=0;
        for(int i=0;i<diff.length;i++){
            curr+=diff[i];
            if(curr> capacity) return false;
        }
        return true;
    }
}