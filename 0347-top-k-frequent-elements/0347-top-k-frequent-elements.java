class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        int[] arr = new int[map.size()];
        int m = map.size() - 1;
        for (int x : map.keySet()) {
            arr[m--] = map.get(x);

        }
        Arrays.sort(arr);
        int l = 0;
        int[] ans = new int[k];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (l == k) {
                break;
            }
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            for (int x : map.keySet()) {
                if (map.get(x) == arr[i]) {
                    ans[l++] = x;
                }
            

        }}
        return ans;
    }
}