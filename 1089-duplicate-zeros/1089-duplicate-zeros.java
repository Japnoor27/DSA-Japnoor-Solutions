class Solution {
    public void duplicateZeros(int[] arr) {
        ArrayList <Integer> ar=new ArrayList<>(arr.length);
for(int num:arr){
    if(num==0){
        ar.add(0);
        ar.add(0);
    }
    else{
        ar.add(num);
    }
}
for(int i=0;i<arr.length;i++){
    arr[i]=ar.get(i);
}
    }
}