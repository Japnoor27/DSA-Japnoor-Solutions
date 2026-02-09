class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int index,int[] nums,List<Integer>temp,List<List<Integer>> ans){
     if(index==nums.length){
        ans.add(new ArrayList<>(temp));
        return;
     }
     temp.add(nums[index]);
     backtrack(index+1,nums,temp,ans);
      temp.remove(temp.size()-1);
     backtrack(index+1,nums,temp,ans);

    }
}