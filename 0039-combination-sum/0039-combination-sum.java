class Solution {
    // HashSet<List<Integer>> set=new HashSet<>();
    public List<List<Integer>> backtrack(int[] nums, List<Integer> ans, List<List<Integer>> temp, int ind, int target) {
        if (target == 0) {

            temp.add(new ArrayList<>(ans));

            return temp;
        }

        if (ind == nums.length || target < 0) {
            return temp;
        }

        ans.add(nums[ind]);
        backtrack(nums, ans, temp, ind , target - nums[ind]);
        ans.remove(ans.size() - 1);
        // int idx = ind + 1;
        // while (idx < nums.length && nums[idx] == nums[idx-1]) {
        //     idx++;

        // }
        backtrack(nums, ans, temp, ind+1, target);

        return temp;

    }

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> temp = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        return backtrack(nums, ans, temp, 0, target);
    }
}