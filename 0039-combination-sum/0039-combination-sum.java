class Solution {
            HashSet<List<Integer>> set=new HashSet<>();

    public List<List<Integer>> backtrack(int[] nums,List<Integer> ans,List<List<Integer>> temp,int i,int target){
        if(i==nums.length|| target<0) return temp;
        if(target==0){
            // List <Integer> list=new ArrayList<>(temp);
            if(!set.contains(ans)){
                temp.add(new ArrayList<>(ans));
                set.add(ans);
            }
            return temp;

        }
        ans.add(nums[i]);
        backtrack(nums,ans,temp,i+1,target-nums[i]);
        backtrack(nums,ans,temp,i,target-nums[i]);
        ans.remove(ans.size()-1);
         backtrack(nums,ans,temp,i+1,target);
return temp;

        
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> temp=new ArrayList<>();
        return backtrack(nums,ans,temp,0,target);
    }
}