class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        if(n<k)return -1;
        int fwindow=0,lwindow=0,sum=0;
        for(int i=0;i<k;i++){
            fwindow+=cardPoints[i];
        }
        lwindow=fwindow;
         for(int i=0;i<k;i++){
           fwindow+=cardPoints[n-1-i]-cardPoints[k-i-1];
            lwindow=Math.max(fwindow,lwindow);
         }
  return lwindow;      
    }
}