class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff=new int[n+1];
        for(int[] t:bookings){
            int first=t[0];
            int last=t[1];
            int seats=t[2];
diff[first-1]+=seats;
diff[last]-=seats;

        }
        int curr=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            curr+=diff[i];
            ans[i]=curr;
        }
        return ans;
    }
}