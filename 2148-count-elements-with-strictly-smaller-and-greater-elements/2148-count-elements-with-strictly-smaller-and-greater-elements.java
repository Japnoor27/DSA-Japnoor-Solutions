class Solution {
    public int countElements(int[] nums) {
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            boolean ok = false;

            for(int j = 0; j < nums.length; j++) {
                if(nums[j] < nums[i]) {   // smaller mila
                    for(int k = 0; k < nums.length; k++) {
                        if(nums[k] > nums[i]) {  // greater mila
                            count++;
                            ok = true;
                            break;
                        }
                    }
                }
                if(ok) break;
            }
        }

        return count;
    }
}
