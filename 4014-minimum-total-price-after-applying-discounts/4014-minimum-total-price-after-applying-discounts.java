class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int len_prices=prices.length;
        int len_discounts=discounts.length;
        double sum=0.0;
        for(int i=len_prices-1;i>=0;i--){
            if(len_discounts>0){
                sum+=((100-discounts[len_discounts-1])*(prices[i]))/100.0;
                len_discounts--;
            }
            else{
                sum+=prices[i];
            }
        }
        return sum;
    }
}