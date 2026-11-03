class Solution {
    public int minMoves(int[] nums) {
        int max=Arrays.stream(nums).max().getAsInt();
        int move=0;
        for(int num:nums){
            move+=(max-num);

        }
        return move;
    }
}