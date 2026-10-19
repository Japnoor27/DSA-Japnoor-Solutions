class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            if(word.indexOf(x)!=-1){
                arr.add(i);
            }
        }
        return arr;
    }
}