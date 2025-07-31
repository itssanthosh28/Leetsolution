class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currmax=nums[0],max=nums[0];
        for(int i=1;i<n;i++){
            currmax=Math.max(nums[i],nums[i]+currmax);
            max=Math.max(max,currmax);

        }
        return max;
    }
}