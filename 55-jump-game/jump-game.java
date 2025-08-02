class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int max=0;
        int n=nums.length;
        while(i<n){
              if(i>max)return false;
              max=Math.max(max,nums[i]+i);
              i++;
        }
    return true;    
    }
}