class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum_apple=0;
        for(int num:apple){
            sum_apple+=num;
        }
        Arrays.sort(capacity);
       for(int i = 0; i < capacity.length / 2; i++){
    int temp = capacity[i];
    capacity[i] = capacity[capacity.length - 1 - i];
    capacity[capacity.length - 1 - i] = temp;
}
        int count=0;

        for(int num:capacity){
            if(sum_apple<=0){
               break;
            }
             count++;
                sum_apple-=num;

        }
        return count;
    }
}