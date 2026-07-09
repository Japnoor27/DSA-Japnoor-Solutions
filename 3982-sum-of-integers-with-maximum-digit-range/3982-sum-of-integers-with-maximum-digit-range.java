class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int maxrange=-1;
        for(int num:nums){
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int ori=num;
            while(num!=0){
                int rem=num%10;
                if(rem>max){
                    max=rem;
                }
                if(rem<min){
                    min=rem;
                }
                num=num/10;

               
            }
            int range=max-min;
            
            if(maxrange<range){
                maxrange=range;
                sum=ori;

            }
            else if(range==maxrange){
                sum+=ori;
            }
        }
        
        return sum;
    }
}