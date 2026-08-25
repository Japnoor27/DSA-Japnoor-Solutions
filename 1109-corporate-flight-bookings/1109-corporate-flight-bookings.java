class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff=new int[n+1];
        for(int[] b:bookings){
            int start=b[0];
            int end=b[1];
            int seats=b[2];
            diff[start-1]+=seats;
            diff[end]-=seats;
            
        }
        int[] ans=new int[n];
        int curr=0;
        for(int i=0;i<n;i++){
            curr+=diff[i];
            ans[i]=curr;
        }
return ans;
    }
}