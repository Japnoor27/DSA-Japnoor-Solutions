class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
       int total=0;
       for(int i=0;i<boxTypes.length;i++){
        if(truckSize>0){
            if(boxTypes[i][0]>truckSize){
                total+=truckSize*(boxTypes[i][1]);
                truckSize=0;
           }
           else{
            truckSize-=boxTypes[i][0];
            total+=boxTypes[i][0]*boxTypes[i][1];}
        }
       }
return total;
    }
}