class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap<Character, Integer> chars_map = new HashMap<>();
        int count = 0;
        boolean flag = true;
        for (char ch : chars.toCharArray()) {
            chars_map.put(ch, chars_map.getOrDefault(ch, 0) + 1);
        }
        for (String str : words) {
            flag = true;

            HashMap<Character, Integer> words_map = new HashMap<>();

            for (char word : str.toCharArray()) {

                words_map.put(word, words_map.getOrDefault(word, 0) + 1);
            }
            for (char key : words_map.keySet()) {
                if (!chars_map.containsKey(key) || words_map.get(key) > chars_map.get(key)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count += str.length();
            }

        }
        return count;
    }
}