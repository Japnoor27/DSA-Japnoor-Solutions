class Solution {
    public long sumAndMultiply(int n) {
        
        StringBuilder str=new StringBuilder();
        while(n!=0){
            int rem=n%10;
            if(rem!=0){
                str.append(rem);
            }
            n=n/10;
        }
        if (str.length() == 0) return 0;
        str=str.reverse();
        long num=Long.parseLong(str.toString());
        long x=num;
        long sum=0;
        while(num!=0){
            long rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return (long)sum*x;


    }
}