class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        HashSet <Integer> set=new HashSet<>();
        for(int i=1;i<arr.length;i++){
            set.add(arr[i]-arr[i-1]);

        }
        return set.size()==1;
    }
}