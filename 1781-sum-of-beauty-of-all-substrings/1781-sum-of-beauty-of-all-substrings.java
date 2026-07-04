
// public int generate(String str){
//     HashMap <Character,Integer> map=new HashMap <>();
//     for(int i=0;i<str.length();i++){
//         char ch=str.charAt(i);
//         if(map.containsKey(ch)){
//                 map.put(ch,map.get(ch)+1);

//         }
//         else{
//             map.put(ch,1);
//         }
//     }
//     int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
//     for(char x:map.keySet()){
//         max=Math.max(map.get(x),max);
//         min=Math.min(map.get(x),min);
//     }
//     return max-min;
// }
    // public int beautySum(String s) {
    //     int sum=0;
    //     for(int i=0;i<s.length();i++){
    //         for(int j=i;j<s.length();j++){
    //             sum+=generate(s.substring(i,j+1));
    //         }
    //     }
    //     return sum;
    // }
    class Solution {
    public int beautySum(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            int[] freq=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                    min=Math.min(min,freq[k]);
                    max=Math.max(max,freq[k]);}
                }
                ans+=max-min;
            }
        }
        return ans;
            }
}
