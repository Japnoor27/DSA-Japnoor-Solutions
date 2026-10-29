class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total_gas=0;
        int total_cost=0;
        for(int num:gas){
            total_gas+=num;
        }
        for(int num:cost){
            total_cost+=num;
        }
        if(total_gas<total_cost) return -1;
        int start=0,curr=0;
        for(int i=0;i<gas.length;i++){
            curr+=gas[i]-cost[i];
            if(curr<0) {
                start=i+1;
                curr=0;
            }
        }
        return start;
    }
}