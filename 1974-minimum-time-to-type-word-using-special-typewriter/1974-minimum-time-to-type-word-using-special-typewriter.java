class Solution {
    public int minTimeToType(String word) {
        char curr='a';
        int time=0;
        for(int i=0;i<word.length();i++){
            char next=word.charAt(i);
            int diff=Math.abs(curr-next);
            int min=Math.min(diff,26-diff);
            time+=min+1;
            curr=next;

        }
        return time;
    }
}