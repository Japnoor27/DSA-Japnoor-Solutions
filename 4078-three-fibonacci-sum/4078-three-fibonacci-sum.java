class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0,b=1,c=0;
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0);
        arr.add(1);
        while(c<=n){
c=a+b;

arr.add(c);
a=b;
b=c;

        }
        int left=0;
        int sum=0;
        for(int i=0;i<=arr.size()-3;i++){
            sum=(arr.get(i)+arr.get(i+1)+arr.get(i+2));
            if(sum==n){
                return true;}
                sum=0;
        }
        return false;
    }
}