class Solution {
    public void sum(int index,int[] cand,int target,List<List<Integer>> ans,List<Integer> ds){
        if(index==cand.length){
            if(target==0){
            ans.add(new ArrayList<>(ds));
            
        }
        return;
        }
        if(target>=cand[index]){
            ds.add(cand[index]);
            sum(index,cand,target-cand[index],ans,ds);
            ds.remove(ds.size()-1);
        }
        sum(index+1,cand,target,ans,ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        sum(0,candidates,target,ans,ds);
        return ans;
    }
}