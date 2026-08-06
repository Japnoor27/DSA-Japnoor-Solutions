class Solution {
    public int smallestNumber(int n, int t) {
    int num=n;
    while(true){
        int prod=1;
        num=n;
        while(num!=0){
            int rem=num%10;
            prod*=rem;
            num=num/10;
        }
        num=n;
        if(prod%t==0){
            return num;
        }
        else{
            n++;
        }}

    }
}