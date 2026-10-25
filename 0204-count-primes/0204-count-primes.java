class Solution {
    public int countPrimes(int n) {
      
        boolean[] prime=new boolean[n+1];
        int count=0;
        for(int i=2;i<n;i++) prime[i]=true;
        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(prime[i]==true){
                count++;
            }
        }
return count;
    }
}