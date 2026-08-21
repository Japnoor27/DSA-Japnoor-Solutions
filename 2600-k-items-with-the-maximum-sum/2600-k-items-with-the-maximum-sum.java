class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum=0;
        int rem=0;
       if(numOnes<k){
        rem=k-numOnes;
        for(int i=0;i<numOnes;i++){
            sum+=1;
        }
       }
       else{
         for(int i=0;i<k;i++){
            sum+=1;
        }
       }
       if(rem<=numZeros){
       
           return sum;
        
       }
       else{
        rem-=numZeros;
        sum-=rem;
       }

        
        return sum;
        
    }
}