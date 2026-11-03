class Solution {
    public int minMoves(int[] nums) {
        int min = Arrays.stream(nums).min().getAsInt();
        int moves = 0;

        for(int num : nums) {
            moves += num - min;
        }

        return moves;
    }
}