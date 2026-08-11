class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum_apple=0;
        for(int num:apple){
            sum_apple+=num;
        }
        Arrays.sort(capacity);
   
        int count=0;

        for(int i=capacity.length-1;i>=0;i--){
            if(sum_apple<=0){
               break;
            }
             count++;
                sum_apple-=capacity[i];

        }
        return count;
    }
}