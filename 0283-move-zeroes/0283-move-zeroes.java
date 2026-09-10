class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
        for(int num:nums){
            if(num==0)count++;
            else{
                arr.add(num);
            }
        }
        while(count>0){
            arr.add(0);
            count--;
        }
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
       

    }
}