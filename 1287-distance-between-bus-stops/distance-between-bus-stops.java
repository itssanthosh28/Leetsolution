class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int clock=0;
        int totaldistance=0;
        if(start>destination){
            int temp = start;
            start=destination;
            destination=temp;
        }
        for(int d : distance){
            totaldistance +=d;
        }
         
        for(int i=start ; i<destination;i++){
            clock+=distance[i];
        }
         int anticlock = totaldistance - clock;

         return Math.min(clock,anticlock);
         }
}