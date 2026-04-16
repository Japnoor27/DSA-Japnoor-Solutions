class Solution {
    public void backtrack(int ind,int[] candidates,int target,List<List<Integer>> ans,List<Integer> temp){
        if(ind==candidates.length){
            if(target==0){
                ans.add(new ArrayList <>(temp));
            }
            return;
        }
        if(target>=candidates[ind]){
            temp.add(candidates[ind]);
            backtrack(ind,candidates,target-candidates[ind],ans,temp);
            temp.remove(temp.size()-1);
        }
         backtrack(ind+1,candidates,target,ans,temp);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List <List<Integer>> ans=new ArrayList<>();
        List <Integer> temp=new ArrayList<>();
        backtrack(0,candidates,target,ans,temp);
        return ans;
    }
}