class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList <String> arr=new ArrayList <>();
        HashMap <String,Integer> map=new HashMap <>();
        for(int i=0;i<list1.length;i++){
            map.put(list1[i],i);
        }
        HashMap <String,Integer> map2=new HashMap<>();
        for(int i=0;i<list2.length;i++){
            if(map.containsKey(list2[i])){
                map2.put(list2[i],i+map.get(list2[i]));


            }
        }
        int min=Integer.MAX_VALUE;
        for(String x:map2.keySet()){
            min=Math.min(map2.get(x),min);
        


        }
        for(String x:map2.keySet()){
            if(map2.get(x)==min){
                arr.add(x);}
        }
        return arr.toArray(new String[0]);
    }
}