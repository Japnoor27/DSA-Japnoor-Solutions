class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s=0;
        int e=people.length-1;
        int boats=0;
        while(s<=e){
            int sum=people[s]+people[e];
            if(sum<=limit){
s++;
            }
           
                e--;
            
            boats++;
        }
        return boats;
    }
}