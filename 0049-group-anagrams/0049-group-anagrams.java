class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    Map <String,List<String>> map=new HashMap <>();
        for(String s:strs){
            int[] freq=new int[26];
            for(char ch:s.toCharArray()){
                freq[ch-'a']++;

            }
            String key=Arrays.toString(freq);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                List <String> list=new ArrayList<>();
                list.add(s);
                map.put(key,list);

            }
        }
        return new ArrayList<>(map.values());
    }
}