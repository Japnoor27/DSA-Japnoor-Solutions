class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for(int i=lower;i<=upper;i++){
            ArrayList<Integer> list=new ArrayList <>();
            if(set.contains(i)) continue;
            int start=i;
            while(i<=upper && !set.contains(i)){
                i++;
            }
            list.add(start);
            list.add(i-1);
            ans.add(list);
        }
        return ans;
    }
}