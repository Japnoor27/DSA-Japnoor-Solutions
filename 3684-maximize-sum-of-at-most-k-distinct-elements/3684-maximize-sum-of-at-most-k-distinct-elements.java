class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int x:set) list.add(x);
        int size=Math.min(list.size(),k);
                int[] arr=new int[size];

        int j=0;
        for(int i=list.size()-1;i>=list.size()-size;i--){
            arr[j++]=list.get(i);
        }
        return arr;
    }
}