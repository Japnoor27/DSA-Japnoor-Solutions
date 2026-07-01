class Solution {
    public boolean isPrime(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
                    return true;


    }
    public int[] closestPrimes(int left, int right) {
        // int[] arr = new int[2];
        // boolean[] prime = new boolean[right - left + 1];
        // for (int i = left; i <= right; i++) {
        //     for (int j = 2; j < i; j++) {
        //         if (!prime[i]) {
        //             for (int k = j * j; k <= i; k += j) {
        //                 prime[i] = true;
        //             }
        //         }
        //     }
        // }
        // int num1 = -1;
        // int num2 = -1;
        // int ind = 1;
        // for (int i = 0; i < prime.length; i++) {
        //     if (prime[i] == true) {
        //         if (ind >= 0) {
        //             arr[ind--] = i;
        //         }
        //     }

        // }
        // return arr;
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                // int prev=i;
                // mindiff=Math.min(mindiff,prev-)
                arr.add(i);

            }
        }
        int num1=-1,num2=-1;
                    int mindiff=Integer.MAX_VALUE;

        for(int i=1;i<arr.size();i++){
            int diff=arr.get(i)-arr.get(i-1);
            if(diff<mindiff){
                mindiff=diff;
                num1=arr.get(i-1);
                num2=arr.get(i);
            }
        }
return new int[]{num1,num2};
    }
}