class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans=-1,ans1=-1;
        int n=nums.length;
        int s=0,st=0,e=n-1,en=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]==target){
                ans=mid;
                e=mid-1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        while(st<=en){
            int mid=st+(en-st)/2;
            if(nums[mid]==target){
                ans1=mid;
                st=mid+1;
            }
            else if(target<nums[mid]){
                en=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return new int[]{ans, ans1};

    }
}