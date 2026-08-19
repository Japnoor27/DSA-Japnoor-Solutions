class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int ele:nums){
            arr.add(ele);
        }
        Collections.sort(arr);
        int size=arr.size();
        return arr.get(size-1)+arr.get(size-2)-arr.get(0);
    }
}