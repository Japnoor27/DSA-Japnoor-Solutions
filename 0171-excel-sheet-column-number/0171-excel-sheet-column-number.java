class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(char ch:columnTitle.toCharArray()){
int num=ch-'A'+1;
ans=ans*26+num;
        }
        return ans;
    }
}