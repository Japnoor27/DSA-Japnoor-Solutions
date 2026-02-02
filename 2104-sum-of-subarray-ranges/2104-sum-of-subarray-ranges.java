class Solution {
    public long subArrayRanges(int[] nums) {
            int MOD=1000000007;
            int n=nums.length;
            int[] left=new int[n];
            int[] right=new int[n];
            Stack <Integer> st=new Stack<>();
            for(int i=0;i<n;i++){
                while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    left[i]=i+1;
                }
                else{
                    left[i]=i-st.peek();
                }
                st.push(i);
            }
            st.clear();
            for(int i=n-1;i>=0;i--){
                while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                    st.pop();
                }
                if(st.isEmpty()){
                    right[i]=n-i;
                }
                else{
                    right[i]=st.peek()-i;
                }
                st.push(i);
            }
          
                long ans=0;
                for(int i=0;i<n;i++){
                    long total=(long)nums[i]*left[i]*right[i];
                    ans=(ans+total);
                }    
              
             int[] left_new=new int[n];
            int[] right_new=new int[n];
            Stack <Integer> sta=new Stack<>();
            for(int i=0;i<n;i++){
                while(!sta.isEmpty() && nums[sta.peek()]<nums[i]){
                    sta.pop();
                }
                if(sta.isEmpty()){
                    left_new[i]=i+1;
                }
                else{
                    left_new[i]=i-sta.peek();
                }
                sta.push(i);
            }
            sta.clear();
            for(int i=n-1;i>=0;i--){
                while(!sta.isEmpty() && nums[sta.peek()]<=nums[i]){
                    sta.pop();
                }
                if(sta.isEmpty()){
                    right_new[i]=n-i;
                }
                else{
                    right_new[i]=sta.peek()-i;
                }
                sta.push(i);
            }
            while(!sta.isEmpty()){
            sta.pop();}
                long ans_new=0;
                for(int i=0;i<n;i++){
                    long total=(long)nums[i]*left_new[i]*right_new[i];
                    ans_new=(ans_new+total);
                }    
            return ans_new-ans;
        
    }
}