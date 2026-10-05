class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue <Integer> q=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        int time=0;
        while(!q.isEmpty()){
            int person=q.peek();
            tickets[person]--;
            time++;
            if(person==k){
                if(tickets[k]==0) break;
                else{
                    q.add(q.poll());
                }
            }
            else{
                if(tickets[person]==0){
                    q.poll();
                }
                else{
                    q.add(q.poll());
                }
            }
        }
        return time;
    }
}