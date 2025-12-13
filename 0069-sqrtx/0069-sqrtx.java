class Solution {
    public int mySqrt(int x) {

        int s = 0, e = x;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long sq = (long) mid * mid;  // ✅ FIX

            if (sq == x) {
                return mid;
            } 
            else if (sq < x) {
                ans = mid;
                s = mid + 1;
            } 
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
}
