class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum=0;
        int n=cost.length;
        for(int i=0;i<n;i++){
            if((n-i-1)%3!=2) sum+=cost[i];
        }
        return sum;
    }
}