class Solution {
    public String reverseVowels(String str) {
        char[] arr = str.toCharArray();

        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            if ("aeiouAEIOU".indexOf(arr[s]) == -1) {
                s++;
            }
            else if ("aeiouAEIOU".indexOf(arr[e]) == -1) {
                e--;
            }
            else {
                char temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;

                s++;
                e--;
            }
        }

        return new String(arr);
    }
}