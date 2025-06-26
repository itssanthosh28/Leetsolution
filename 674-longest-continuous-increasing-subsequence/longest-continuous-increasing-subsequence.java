class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0) return 0;
        int max =1 ,ctr=1;
       
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                ctr++;
                max=Math.max(max,ctr);
                

            }
            else{
                ctr=1;
            }
        
        }
        return max; 
    }
}