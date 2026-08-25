class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff=new int[n];
        for(int[] b:bookings){
            int start=b[0];
            int end=b[1];
            int add=b[2];
            for(int i=start-1;i<end;i++){
                diff[i]+=add;
            }
        }
        return diff;
    }
}