class Solution {
    public void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public void backtrack(int ind,int[] nums,List<List<Integer>> ans){
        if(ind==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                temp.add(nums[i]);
            }
            ans.add(temp);
            return;
        }
        for(int i=ind;i<nums.length;i++){
            swap(i,ind,nums);
            backtrack(ind+1,nums,ans);
            swap(i,ind,nums);

        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,nums,ans);
        return ans;
    }
}