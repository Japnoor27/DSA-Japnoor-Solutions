import java.util.*;

class Solution {
    public long maximizeSum(int[] nums, int k) {
        long sum = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b[1], a[1])
        );

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            char[] arr = String.valueOf(nums[i]).toCharArray();
            Arrays.sort(arr);

            String s = "";
            for (int j = arr.length - 1; j >= 0; j--) {
                s += arr[j];
            }

            int maxNum = Integer.parseInt(s);
            int gain = maxNum - nums[i];

            if (gain > 0) {
                pq.add(new int[]{nums[i], gain});
            }
        }

        while (k > 0 && !pq.isEmpty()) {
            int[] curr = pq.poll();
            sum += curr[1];
            k--;
        }

        return sum;
    }
}