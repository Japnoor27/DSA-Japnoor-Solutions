class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n=trips.length;
        int[] diff=new int[1001];
        for(int[] t:trips){
            int pass=t[0];
            int from=t[1];
            int to=t[2];
            diff[from]+=pass;
            diff[to]-=pass;
        }
        int curr=0;
        for(int i=0;i<1000;i++){
            curr+=diff[i];
            if(curr>capacity){
                return false;
            }
        }
        return true;
    }
}