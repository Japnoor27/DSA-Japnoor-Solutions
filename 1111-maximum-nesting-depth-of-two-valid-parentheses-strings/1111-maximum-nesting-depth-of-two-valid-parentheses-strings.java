class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        ArrayList<Integer> arr=new ArrayList<>();
        int count=0;
        for(int i=0;i<seq.length();i++){
            char ch=seq.charAt(i);
            if(ch=='(') {count++;
            arr.add(count);}
            if(ch==')'){
                if(count>0){
                    arr.add(count);
                    count--;
                }
            }
        }
int[] list=new int[seq.length()];
for(int i=0;i<arr.size();i++){
if(arr.get(i)%2==0){
    list[i]=1;
}
else{
    list[i]=0;
}
}
return list;
    }
}