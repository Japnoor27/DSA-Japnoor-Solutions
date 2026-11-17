class Solution {
    public static void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    public List<List<Integer>> backtrack(int[] nums,List<List<Integer>> temp,int idx){
       if(idx==nums.length){
            List <Integer> ans=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ans.add(nums[i]);
            }
            temp.add(ans);
            return temp;
        }  
        for(int i=idx;i<nums.length;i++){
        swap(i,idx,nums);
        backtrack(nums,temp,idx+1);
        swap(i,idx,nums);}
        return temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> temp=new ArrayList<>();
       
       return backtrack(nums,temp,0);
    }
}