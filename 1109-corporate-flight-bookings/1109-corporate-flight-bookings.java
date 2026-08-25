class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        // int[] diff=new int[n];
        // for(int[] b:bookings){
        //     int start=b[0];
        //     int end=b[1];
        //     int add=b[2];
        //     for(int i=start-1;i<end;i++){
        //         diff[i]+=add;
        //     }
        // }
        // return diff;
        int[] diff=new int[n+1];
        for(int[] b:bookings){
            int start=b[0];
            int end=b[1];
            int add=b[2];
           
                diff[start-1]+=add;
                diff[end]-=add;

        }
            int cur=0;
            int[] ans=new int[n];
            for(int i=0;i<n;i++){
                cur+=diff[i];
                ans[i]=cur;
            }
        
        return ans;
    }

}