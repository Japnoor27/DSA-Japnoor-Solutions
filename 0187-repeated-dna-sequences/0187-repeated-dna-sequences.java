class Solution {
    public int getValue(char ch){
        if(ch=='A') return 0;
        if(ch=='C') return 1;
        if(ch=='T') return 2;
        return 3;
    }
    public List<String> findRepeatedDnaSequences(String s) {
        List <String> ans=new ArrayList<>();
        HashSet <Long> seen=new HashSet<>();
        HashSet <String> repeated=new HashSet<>();
        int n=s.length();
        int m=10;
        if(m>n) return ans;
        long textHash=0;
        long base=4;
        long mod=1_000_000_00L;
        long high=1;
        for(int i=0;i<m-1;i++){
            high=(high*base)%mod;
         }
         for(int i=0;i<m;i++){
            textHash=(textHash*base+getValue(s.charAt(i)))%mod;
         }
         for(int i=0;i<=n-m;i++){
            if(seen.contains(textHash)){
                repeated.add(s.substring(i,i+m));
            }
            seen.add(textHash);
            if(i<n-m){
                textHash=(textHash-getValue(s.charAt(i))*high)%mod;
                textHash=(textHash*base+getValue(s.charAt(i+m)))%mod;
                if(textHash<0)textHash+=mod;
            }
            
         }
         ans.addAll(repeated);
         return ans;
    }
}