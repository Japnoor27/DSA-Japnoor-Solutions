class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack <Integer> st=new Stack <>();
           int n=nums.length;
        int[] arr=new int[n];
     
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i%n]=-1;
            }
            else{
                arr[i%n]=st.peek();
            }
            st.push(nums[i%n]);
        }
        
        return arr;
    }
}