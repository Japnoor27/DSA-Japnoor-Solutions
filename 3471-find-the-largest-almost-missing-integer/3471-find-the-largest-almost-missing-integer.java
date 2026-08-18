class Solution {
    public int largestInteger(int[] nums, int k) {
        int left = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();

            if (i - left + 1 == k) {
                for (int j = left; j <= i; j++) {
                    set.add(nums[j]);
                }
                left++;
            }
            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }
        int max = -1;
        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                max = Math.max(max, x);

            }
        }
        return max;
    }
}