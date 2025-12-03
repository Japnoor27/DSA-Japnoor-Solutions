class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList <Integer> arr =new ArrayList <> ();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
                arr.add(nums[i]);
            }
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return arr.size();
    }
}