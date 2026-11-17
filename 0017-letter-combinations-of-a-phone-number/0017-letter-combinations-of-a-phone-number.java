class Solution {
    String[] arr={"","","abc","def","ghi","jkl",
    "mno","pqrs","tuv","wxyz"};
    public List<String> backtrack(List<String> ans,int i,String digits,String temp){
        if(i==digits.length()){
            ans.add(temp);
            return ans;
        }
    int num=digits.charAt(i)-'0';
    String str=arr[num];
for(int j=0;j<str.length();j++){
        backtrack(ans,i+1,digits,temp+str.charAt(j));
}
return ans;
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
            return backtrack(ans,0,digits,"");

    }
}