class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
      String[] arr=new String[numRows];
      int currentRow=0;
      boolean goDown=true;
      Arrays.fill(arr,"");
      for(int i=0;i<s.length();i++){
        arr[currentRow]+=s.charAt(i);
      if(i!=0){
          if(currentRow==0 || currentRow==numRows-1 ){
            goDown=!goDown;
        }}
        if(goDown){
            currentRow++;
        }
        else{
            currentRow--;
        }
      
      }
      String str="";
      for(int i=0;i<arr.length;i++){
        str+=arr[i];
      }
      return str;


    }
}