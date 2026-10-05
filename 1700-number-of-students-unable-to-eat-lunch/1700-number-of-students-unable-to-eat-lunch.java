class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        // Queue <Integer> q=new LinkedList<>();
        // int count=0;
        // int i=0;
        // for(int j=0;j<students.length;j++){
        //     q.add(students[j]);
        // }
        // while(!q.isEmpty()){
        //     if(q.peek()==sandwiches[i]){
        //         q.poll();
        //         i++;
        //         count=0;
        //     }
        //     else{
        //         count++;
        //         q.add(q.poll());
        //     }
        //     if(count==q.size()){
        //         break;
        //     }
        // }
        // return q.size();
         Queue <Integer> q=new LinkedList<>();
        int count=0;
        int i=0;
        for(int j=0;j<students.length;j++){
            q.add(students[j]);
        }
        int size=q.size();
        while(!q.isEmpty()){
            if(q.peek()==sandwiches[i]){
                q.poll();
                i++;
                size=q.size();
            }
            else{
                size--;
                q.add(q.poll());
            }
          if(size==0) break;
        }
        return q.size();
    }
}