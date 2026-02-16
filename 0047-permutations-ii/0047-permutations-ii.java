class Solution {
    public void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void per(int index,int nums[],List<List<Integer>> ans ){
            List <Integer> ds=new ArrayList<>();
            if(index==nums.length){
                for(int i=0;i<nums.length;i++){
                  
                    ds.add(nums[i]);
                }
                ans.add(new ArrayList<>(ds));
                return;
            } HashSet<Integer> used = new HashSet<>();   // 🔑 yahin difference

        for(int i = index; i < nums.length; i++){

            if(used.contains(nums[i])) continue;   // duplicate skip
            used.add(nums[i]);
                swap(i,index,nums);
                per(index+1,nums,ans);
                swap(i,index,nums);
            }
        }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        per(0,nums,ans);
        return ans;
    }
}