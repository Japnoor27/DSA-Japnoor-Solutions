class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet <Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=Arrays.stream(nums).max().getAsInt();
        if(max<0) return 1;
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return max+1;
            }
}