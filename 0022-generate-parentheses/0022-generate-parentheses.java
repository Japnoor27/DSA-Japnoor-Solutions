class Solution {
    public List<String> backtrack(int n,int open,int close,String temp,List<String> ans){
        if(open==n && close==n){
            ans.add(temp);
            return ans;
        
        }
        if(close<open){

backtrack(n,open,close+1,temp+")",ans);

        }
        if(open<n){
            backtrack(n,open+1,close,temp+"(",ans);
        }
        return ans;
    }
    public List<String> generateParenthesis(int n) {
        List <String> ans=new ArrayList<>();
        String temp="";
        return backtrack(n,0,0,temp,ans);
    }
}