class Solution {
    public void dfs(int currNum,int target,List <Integer> res){
        if(currNum>target){
            return;
        }
        res.add(currNum);
        for(int d=0;d<10;d++){
            if(currNum*10+d>target) break;
            dfs(currNum*10+d,target,res);
        }
    }
    public List<Integer> lexicalOrder(int n) {
         List <Integer> res= new ArrayList<>();
         for(int i=1;i<10;i++){
            if(i>n) break;
            dfs(i,n,res);
         }
         return res;
    }
}