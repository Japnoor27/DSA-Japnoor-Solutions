class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int ori=money;
        for(int i=0;i<2;i++){
            money-=prices[i];
        }if(money<0)return ori;;
        return money;
    }
}