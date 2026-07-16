class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long sum = 0, max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
                while (map.get(nums[i])>1 || i - left + 1 > k) {
                    sum -= nums[left];
                    map.put(nums[left], map.get(nums[left]) - 1);
                    if (map.get(nums[left]) == 0) {
                        map.remove(nums[left]);
                    }
                    left++;

                }

            
            
            if(i-left+1==k){
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}