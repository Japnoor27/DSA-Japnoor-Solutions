class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int left = 0, sum = 0, fin = Integer.MAX_VALUE;
        int templeft = 0, tempsum = 0;
        for (int i = 0; i < nums.size(); i++) {

            sum += nums.get(i);

            while (i - left + 1 > r) {
                sum -= nums.get(left);
                left++;
            }
            templeft = left;
            tempsum = sum;
            while (i - templeft + 1 >= l) {
                if (tempsum > 0) {
                    fin = Math.min(tempsum, fin);
                }
                tempsum -= nums.get(templeft);
                templeft++;

            }
        }

        if (fin == Integer.MAX_VALUE)
            return -1;

        return fin;
    }
}