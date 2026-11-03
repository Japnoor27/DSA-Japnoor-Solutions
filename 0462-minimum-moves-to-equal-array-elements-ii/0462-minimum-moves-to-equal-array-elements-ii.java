class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int move=0;
        int n=nums.length/2;
        int num=nums[n];
        for(int no:nums){
            move+=Math.abs(no-num);
        }
        return move;
    }
}