class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String,List<String>> map=new HashMap <>();
        for(String str:strs){
            int[] freq=new int[26];
            for(char ch:str.toCharArray()){
                freq[ch-'a']++;
            }
            String key=Arrays.toString(freq);
            if(map.containsKey(key)){
                map.get(key).add(str);
            }
            else{
                List <String> list=new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}