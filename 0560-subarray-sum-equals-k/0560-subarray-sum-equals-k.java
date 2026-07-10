class Solution {
    public int subarraySum(int[] nums, int k) {
    HashMap <Integer,Integer> map=new HashMap <>();
    map.put(0,1);
    int sum=0;
    int count=0;
    for(int num:nums){
        sum+=num;
        int diff=sum-k;
        if(map.containsKey(diff)){
            count+=map.get(diff);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
    }
    return count;
    }
}


// class Solution {
//     public int atMost(int[] nums,int k){
//         int left=0,count=0,sum=0;
//         for(int i=0;i<nums.length;i++){
//         sum+=nums[i];
//         if(sum>k){
//             sum-=nums[left];
//             left++;

//         }
//         count+=i-left+1;}
//         return count;
//     }
//     public int subarraySum(int[] nums, int k) {
// return atMost(nums,k)-atMost(nums,k-1);
//     }
// }