class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arra = new ArrayList<>();
           ArrayList<Integer> temp = new ArrayList<>();
        for (int num : nums) {
            while (num != 0) {
                temp.add(num % 10);
                num=num/10;
            }
            for(int i=temp.size()-1;i>=0;i--){
                arra.add(temp.get(i));
            }
            temp.clear();
        }
        int n = arra.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = arra.get(i);
        }
        return arr;
    }
}