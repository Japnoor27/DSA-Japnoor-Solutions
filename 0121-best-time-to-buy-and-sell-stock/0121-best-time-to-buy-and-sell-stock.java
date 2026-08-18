class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max_val=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            max_val=Math.max(max_val,prices[i]-min);
        }
        
        return max_val;
    }
}