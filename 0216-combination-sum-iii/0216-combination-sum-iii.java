class Solution {
    public void backtrack(int k,int target,int index,List<List<Integer>> ans,List<Integer> temp){
            if(temp.size()==k){
                if(target==0){
                    ans.add(new ArrayList<>(temp));
                }
            }
for(int i=index;i<=9;i++){
    if(i>target) break;
    temp.add(i);
    backtrack(k,target-i,i+1,ans,temp);
    temp.remove(temp.size()-1);
}
        }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(k,n,1,ans,temp);
return ans;
    }
}