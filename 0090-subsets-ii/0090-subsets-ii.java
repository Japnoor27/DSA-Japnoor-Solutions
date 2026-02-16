class Solution {
    public void find(int index,int nums[],List<Integer> ds,List<List<Integer>> a){
        a.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++){
            if(i!=index && nums[i]==nums[i-1]) continue;
            ds.add(nums[i]);
            find(i+1,nums,ds,a);
            ds.remove(ds.size()-1);

        }
        }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> a=new ArrayList<>();
        List <Integer> ds=new ArrayList<>();
        find(0,nums,ds,a);
        return a;
    }
}