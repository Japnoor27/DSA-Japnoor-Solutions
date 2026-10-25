class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        ArrayList <Integer> arr=new ArrayList<>();
boolean[] prime=new boolean[n+1];
for(int i=2;i<n;i++){
    prime[i]=true;
}
for( int i=2;i*i<n;i++){
    if(prime[i]){
        for(int j=i*i;j<n;j+=i){
            prime[j]=false;
        }
    }
}
for(int i=1;i<n;i++){
    if(prime[i]){
arr.add(i);
    }
}
     List<List<Integer>> list=new ArrayList<>();
    for(int x=2;x<=n/2;x++){
        int y=n-x;
        if(prime[x] && prime[y]){
            List <Integer> a=new ArrayList<>();
            a.add(x);
            a.add(y);
            list.add(a);
        }
        
    }  
    return list;
    }
}