class Solution {

    public boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int num1=-1,num2=-1,min=Integer.MAX_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(prime(i)){
                arr.add(i);

            }


        }
        for(int i=1;i<arr.size();i++){
           int diff= arr.get(i)-arr.get(i-1);
            if(diff<min){
                num1=arr.get(i-1);
                num2=arr.get(i);
                min=diff;
            }
        }
        return new int[]{num1,num2};
    }
}