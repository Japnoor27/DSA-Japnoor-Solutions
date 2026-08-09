class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : stones) {
            arr.add(num);
        }
        int i = 0;
        Collections.sort(arr, Collections.reverseOrder());
        while (arr.size() > 1) {

            int x = arr.get(i);
            int y = arr.get(i + 1);
            if (x == y) {
                arr.remove(Integer.valueOf(x));
                arr.remove(Integer.valueOf(y));
            } else {
                arr.remove(Integer.valueOf(x));
                arr.remove(Integer.valueOf(y));
                arr.add(x-y);
            }
            Collections.sort(arr, Collections.reverseOrder());
           
        }

         if (arr.size() == 0)
                return 0;
            return arr.get(0);
    }
}