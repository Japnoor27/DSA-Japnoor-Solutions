class Solution {
    public void find(int index,int[] nums,List<Integer> ds,List<List<Integer>> a){
        if(index==nums.length){
            a.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[index]);
        find(index+1,nums,ds,a);
        ds.remove(ds.size()-1);
        find(index+1,nums,ds,a);
    }
    public List<List<Integer>> subsets(int[] nums) {
List<List<Integer>> a=new ArrayList<>();
List<Integer> ds=new ArrayList<>();
find(0,nums,ds,a);
return a;
    }
}