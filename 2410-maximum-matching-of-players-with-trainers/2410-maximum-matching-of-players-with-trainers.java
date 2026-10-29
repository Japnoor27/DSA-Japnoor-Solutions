class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int p=0,t=0;
        int p_len=players.length;
        int t_len=trainers.length;
        Arrays.sort(players);
        Arrays.sort(trainers);
        while(p<p_len && t<t_len){
            if(players[p]<=trainers[t]) p++;
            t++;
        }
        return p;
    }
}