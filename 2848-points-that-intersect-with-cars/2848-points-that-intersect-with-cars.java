class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] diff=new int[102];
        for(List <Integer> a:nums){
            int start=a.get(0);
            int end=a.get(1);
            diff[start]+=1;
            diff[end+1]-=1;
        }
        int curr=0,count=0;
        for(int i=0;i<diff.length;i++){
            curr+=diff[i];
           if(curr>0) count++;
        }
        return count;
    }
}