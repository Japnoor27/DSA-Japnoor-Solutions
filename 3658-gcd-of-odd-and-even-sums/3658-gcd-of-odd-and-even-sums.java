class Solution {
    public int gcd(int i,int j){
        if(j==0) return i;
        return gcd(j,i%j);
    }
    public int gcdOfOddEvenSums(int n) {
        int i=0;
        int j=0;
        for(int num=1;num<=n;num++){
i+=2*num;
j+=2*num+1;
        }
return gcd(j,i);

    }
}