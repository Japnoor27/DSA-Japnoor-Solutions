class Solution {
    public int mySqrt(int x) {
        int s = 0;
        int e = x;
        int found = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            long val = (long) mid * mid;  // prevent overflow

            if (val == x) {
                return mid;
            } else if (val < x) {
                found = mid;   // candidate
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return found;  // floor(sqrt(x))
    }
}
