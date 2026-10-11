class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
      TreeSet <Integer> set=new TreeSet<>();
        HashSet <Integer> set2=new HashSet<>();

        for(int num:nums1){
set.add(num);
        }
        for(int num:nums2){
set2.add(num);
        }
set.retainAll(set2);

int n=1;
if(!set.isEmpty()){
    for(int num:set){
    return num;
}
}
return -1;
    }
}