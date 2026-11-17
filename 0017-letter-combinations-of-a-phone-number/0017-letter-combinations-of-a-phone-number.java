class Solution {
    String[] arr={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> backtrack(String digits,List<String> ans,String temp,int i){
        if(i==digits.length()){
            ans.add(temp);
            return ans;
        }
       
 int num=digits.charAt(i)-'0';
  String str=arr[num];
  for(int j=0;j<str.length();j++){

 backtrack(digits,ans,temp+str.charAt(j),i+1);
        }
        return ans;
       
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        return backtrack(digits,ans,"",0);
    }
}