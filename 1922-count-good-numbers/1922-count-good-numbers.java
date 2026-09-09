class Solution { 
    static final long MOD = 1000000007; 
 
    public int countGoodNumbers(long n) { 
        long even = (n + 1) / 2; 
        long odd = n / 2; 
 
        return (int)((power(5, even) * power(4, odd)) % MOD); 
    } 
 
    public long power(long x, long y) { 
        long ans = 1; 
 
        while (y > 0) { 
            if (y % 2 == 1) { 
                ans = (ans * x) % MOD; 
            } 
 
            x = (x * x) % MOD; 
            y = y / 2; 
        } 
 
        return ans; 
    } 
}