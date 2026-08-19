class Solution {
    public int minDeletion(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int ans = 0;
        char del = ' ';

        while (map.size() > k) {
            int min = Integer.MAX_VALUE;

            for (char x : map.keySet()) {
                if (map.get(x) < min) {
                    del = x;
                    min = map.get(x);
                }

            }
            ans += min;
            map.remove(del);
        }
        return ans;
    }
}