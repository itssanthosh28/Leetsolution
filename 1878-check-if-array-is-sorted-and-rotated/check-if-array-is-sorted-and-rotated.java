class Solution {
    public boolean check(int[] nums) {
        // int n=nums.length;
        // int count=0;
        // for(int i=0;i<n;i++){   
        //         if((nums[i]>nums[(i+1)%n] )){
        //             count++;
                    
        //         }
        // }
        int n=nums.length;
        int count=0;
        if(nums[n-1]>nums[0])count++;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1])count++;

        }
   return count<=1;     
    }
}