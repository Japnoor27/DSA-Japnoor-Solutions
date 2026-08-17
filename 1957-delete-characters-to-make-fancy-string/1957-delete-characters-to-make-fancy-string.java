class Solution {
    public String makeFancyString(String s) {
        int count=1;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1))count++;
            else {
                if(count>=3){
                    sb.append(s.charAt(i));
                    sb.append(s.charAt(i));

                }
                else{
                    for(int j=0;j<count;j++){
                        sb.append(s.charAt(i));
                    }
                }

                count=1;
            }
            
            

        }
        if(count>=3){
                    sb.append(s.charAt(s.length()-1));
                    sb.append(s.charAt(s.length()-1));

                }
                else{
                    for(int j=0;j<count;j++){
                        sb.append(s.charAt(s.length()-1));
                    }
                }

        return sb.toString();
    }
}