class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->
        
            Integer.compare(a[1],b[1])
        );
        int last=intervals[0][1];
        int rem=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]>=last){
                last=intervals[i][1];
            }
            else{
                rem++;}
        }
        return rem;
    }
}