class Solution {
   public void sum(int index,int[] cand,int target,List<List<Integer>> ans,List<Integer> ds){

               
            if(target==0){
            ans.add(new ArrayList<>(ds));
            
        
        return;
        }
        for(int i=index;i<cand.length;i++){
            if(i>index && cand[i]==cand[i-1]){
                continue;
            }
            if(cand[i]>target){
                break;
                
            }
            ds.add(cand[i]);
            sum(i+1,cand,target-cand[i],ans,ds);      
            ds.remove(ds.size()-1);  }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
          Arrays.sort(candidates);  
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        sum(0,candidates,target,ans,ds);
        return ans;
    }
}