class Solution {
    public int maxProduct(int n) {
        String str=Integer.toString(n);
        int[] arr=new int[str.length()];
        int i=str.length()-1;
                int len=str.length();

        for(char ch:str.toCharArray()){
arr[i--]=ch-'0';

        }
        Arrays.sort(arr);
        return arr[len-1]*arr[len-2];
    }
}