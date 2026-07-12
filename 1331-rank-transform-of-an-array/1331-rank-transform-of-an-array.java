class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] new_arr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            new_arr[i]=arr[i];
        }
                Arrays.sort(new_arr);

        HashMap <Integer,Integer> map=new HashMap <>();
        int rank=1;
        for(int i=0;i<new_arr.length;i++){
            if(!map.containsKey(new_arr[i])){
                            map.put(new_arr[i],rank++);

            }
        }
        for(int i=0;i<arr.length;i++){
            new_arr[i]=map.get(arr[i]);
        }
        return new_arr;

    }
}