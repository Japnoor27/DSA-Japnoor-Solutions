class Solution {
      int MOD = 1000000007;
    public int factorial(int n){
        if(n==1 || n==0) return 1;
        else{
            return (int)((long)n*factorial(n-1)% MOD);
        }
}
    public int numPrimeArrangements(int n) {
        boolean[] prime=new boolean[n+1];
        for(int i=2;i<=n;i++){
            prime[i]=true;
        }
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(prime[i]==true){
                count++;
            }
          
        }
        return (int)((long)factorial(count)*factorial(n-count)%MOD);
    }
}