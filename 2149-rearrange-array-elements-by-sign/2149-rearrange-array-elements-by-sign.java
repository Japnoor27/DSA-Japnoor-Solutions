class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList <Integer> pos =new ArrayList <>();
        ArrayList <Integer> neg =new ArrayList <>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            else if(nums[i]<0){
                neg.add(nums[i]);
            }
        }
        int k=0;
        int k1=0;
        for(int i=0;i<n;i++){
           if(i%2==0){
            nums[i]=pos.get(k);
            k++;
           }
           else{
            nums[i]=neg.get(k1);
            k1++;
           }
        }
        return nums;

    }
}