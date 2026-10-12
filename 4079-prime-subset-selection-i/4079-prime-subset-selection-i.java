class Solution {
    public List<Integer> maxPrimes(int n, int s) {
ArrayList<Integer> arr = new ArrayList<>();
if (n >= 2) {
    arr.add(2);
}

for (int i = 3; i <= n; i += 2) {
    boolean prime = true;

    for (int j = 3; j * j <= i; j += 2) {
        if (i % j == 0) {
            prime = false;
            break;
        }
    }

    if (prime) {
        arr.add(i);
    }
}
int sum=0;
 ArrayList <Integer> arr1=new ArrayList<>();
for(int i=0;i<arr.size();i++){
   if(sum+arr.get(i)>s){
    break;
   }
   sum+=arr.get(i);
  arr1.add(arr.get(i));
}



return arr1;
    }
}