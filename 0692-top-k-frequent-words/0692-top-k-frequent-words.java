class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map <String,Integer> map=new HashMap <>();
        for(String ele:words){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue <String> pq=new PriorityQueue<>((a,b)->{
if(map.get(a).equals(map.get(b))){
    return b.compareTo(a);
}
return map.get(a)-map.get(b);
        });
        for(String ele:map.keySet()){
            pq.add(ele);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> res=new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return res;
    }
}