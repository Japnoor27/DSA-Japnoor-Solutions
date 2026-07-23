class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.toLowerCase().split("[^a-z]+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);

        }
        String found = "";
        int max = Integer.MIN_VALUE;
       
        for (String str : map.keySet()) {
             boolean flag=true;
            for(String st:banned){
                if(str.equals(st)){
                    flag=false;
                }
            }
            if (max < map.get(str) && flag==true) {
                max = map.get(str);
                found = str;

            }
        }
        return found;
    }
}