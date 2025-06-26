class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum=0,rightsum=0;

        for(int num : nums){
            totalsum +=num;
            }
        for(int i=0;i<nums.length;i++){
            if (rightsum == totalsum-nums[i]){
                return i;
            }
            if(rightsum != totalsum-nums[i])
            totalsum-=nums[i];
                rightsum +=nums[i];
        }
     return -1;   
    }
}