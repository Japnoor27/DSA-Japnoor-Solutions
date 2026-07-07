class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        List<List<String>> list = new ArrayList<>();
        // for(int i=0;i<responses.size();i++){
        //     HashSet <String> set=new HashSet<>();
        //     for(int j=0;j<responses.get(i).size();j++){
        //         set.add(responses.get(i).get(j));

        //     }
        //     List <String> li=new ArrayList <>();
        //     for(String s:set){
        //         li.add(s);
        //     }
        //     list.add(li);

        // }

        //         HashMap <String,Integer> map=new HashMap <>();
        //         for(int i=0;i<list.size();i++){
        //             for(int j=0;j<list.get(i).size();j++){
        //                 String s=list.get(i).get(j);
        //                 map.put(s,map.getOrDefault(s,0)+1);
        //             }
        //         }
        //         int max=0;
        //         String str="";
        //         for(String x:map.keySet()){
        // if(map.get(x)>max){
        //     str=x;
        //     max=map.get(x);
        // }
        // else if(map.get(x)==max && x.compareTo(str)<0){
        //     str=x;
        // }
        //         }
        //         return str;
        HashMap<String, Integer> map = new HashMap<>();
        for (List<String> response : responses) {
            HashSet<String> set = new HashSet<>(response);

            for (String s : set) {
                map.put(s, map.getOrDefault(s, 0) + 1);
            }

        }
        int max = 0;
        String str = "";
        for (String x : map.keySet()) {
            if (map.get(x) > max) {
                str = x;
                max = map.get(x);
            } else if (map.get(x) == max && x.compareTo(str) < 0) {
                str = x;
            }
        }
        return str;
    }
}