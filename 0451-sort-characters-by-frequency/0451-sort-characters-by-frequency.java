class Solution {
    public String frequencySort(String s) {
        HashMap <Character,Integer> map=new HashMap <>();
        for(char ch:s.toCharArray()){
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
        }
        int max=0;
        for(char ch:map.keySet()){
            if(map.get(ch)>max){
                max=map.get(ch);
            }
        }
        String str="";
        for(int i=max;i>=1;i--){
            for(char ch:map.keySet()){
                if(map.get(ch)==i){
                    for(int j=0;j<i;j++){
                        str+=ch;
                    }

                }
            }
        }
        return str;
    }
}