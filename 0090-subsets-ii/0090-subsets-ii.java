class Solution {
    public void backtrack(int ind,int[] nums, List<List<Integer>> ans,List<Integer> temp){
        ans.add(new ArrayList <>(temp));
        for(int i=ind;i<nums.length;i++){
            if(i!=ind && nums[i]==nums[i-1]){
             continue;
            }
               temp.add(nums[i]);
                backtrack(i+1,nums,ans,temp);
                temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList <>();
        backtrack(0,nums,ans,temp);
        return ans;
    }
}