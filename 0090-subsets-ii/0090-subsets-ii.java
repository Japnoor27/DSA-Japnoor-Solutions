class Solution {
    public List<List<Integer>> backtrack(int[] nums,List<Integer> ans,List<List<Integer>> list,int i){
        if(i==nums.length) {
            list.add(new ArrayList<>(ans));
            return list;
        }
                ans.add(nums[i]);
backtrack(nums,ans,list,i+1);
ans.remove(ans.size()-1);
int idx=i+1;
while(idx<nums.length && nums[idx]==nums[idx-1])idx++;
backtrack(nums,ans,list,idx);
       return list; 
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> list=new ArrayList<>();
        return backtrack(nums,ans,list,0);
        
    }
}