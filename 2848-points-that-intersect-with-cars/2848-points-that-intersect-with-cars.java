class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] diff=new int[102];
         for(List <Integer> l:nums){
            int start=l.get(0);
            int end=l.get(1);
            diff[start]+=1;
            diff[end+1]-=1;
         }
         int count=0;
         int curr=0;
         for(int num:diff){
            curr+=num;
            if(curr>0)count++;
         }
         return count;

    }
}