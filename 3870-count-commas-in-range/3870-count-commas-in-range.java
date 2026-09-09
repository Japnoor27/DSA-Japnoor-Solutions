class Solution {
    public int countCommas(int n) {
          int ans = 0;

        for (long x = 1000; x <= n; x *= 1000) {
            ans += n - x + 1;
        }

        return ans;
    }
}