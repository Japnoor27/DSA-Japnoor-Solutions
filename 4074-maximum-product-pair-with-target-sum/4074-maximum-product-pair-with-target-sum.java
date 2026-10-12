class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        HashMap <Integer,Integer> map=new HashMap <>();
          HashMap <Integer,Integer> map2=new HashMap <>();
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
        
            if(map.containsKey(val)){
            map2.put(map.get(val),i);

            }
            map.put(nums[i],i);
        }
        

  
    int max=Integer.MIN_VALUE;
    int ans1=-1,ans2=-1;
    for(int key:map2.keySet()){
int num1=nums[key];
int num2=nums[map2.get(key)];
int prod=num1*num2;
if(prod>max && num1!=num2){
max=prod;
int i=key;
int j=map2.get(key);
if (num1 > num2) {
            ans1 = i;
            ans2 = j;
        } else {
            ans1 = j;
            ans2 = i;
        }
}}


    return new int[]{ans1,ans2};

    }
}