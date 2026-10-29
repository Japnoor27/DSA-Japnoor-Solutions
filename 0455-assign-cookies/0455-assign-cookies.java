class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int g_len=g.length;
        int s_len=s.length;
        int greed=0,size=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(greed<g_len && size<s_len){
if(g[greed]<=s[size]){
    greed++;
}
size++;
        }
        return greed;
    }
}