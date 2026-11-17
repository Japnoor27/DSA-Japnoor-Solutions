class Solution {
    public List<List<Integer>> backtrack(int[] nums,int ind,List<Integer> ans,List<List<Integer>> list){
        if(ind==nums.length) {
            list.add(new ArrayList<>(ans));
            return list;
        }
        ans.add(nums[ind]);
        backtrack(nums,ind+1,ans,list);
        ans.remove(ans.size()-1);
         backtrack(nums,ind+1,ans,list);
         return list;

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        return backtrack(nums,0,ans,list);
    }
}