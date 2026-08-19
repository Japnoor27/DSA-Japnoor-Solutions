class Solution {
    public int maxSum(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        for(int x: nums)if(x>0)set.add(x);
        if(set.size()==0){
            return Arrays.stream(nums).max().getAsInt();
        }
        int sum=0;
        for(int x:set) sum+=x;
        return sum;
    }
}