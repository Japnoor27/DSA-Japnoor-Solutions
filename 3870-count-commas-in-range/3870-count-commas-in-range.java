class Solution {
    public int countCommas(int n) {
        
        int ans = 0;
        for(int j=1;j<=n;j++){
        String str = "";
        str += Integer.toString(j);
        if (str.length() < 4)
            ans+=0;
        else {
            int count = 0;
            for (int i = str.length() - 1; i > 0; i--) { //here >0 not >=

                count++;
                if (count == 3) {

                    ans++;
                    count = 0;
                }
            }
        }}
        return ans;
    }
}