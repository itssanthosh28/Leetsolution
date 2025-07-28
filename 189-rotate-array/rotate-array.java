class Solution {
    public void rotate(int[] nums, int k) {
        // if(k==nums.length)return;
       
        //  int temp=0;
        // while (k!=0){
        //    temp=nums[nums.length-1];
        //     for(int i=nums.length-1;i>=1;i--){
        //              nums[i]=nums[i-1];                   
        //     }
        //     nums[0]=temp;
        //      k--;
         
        // }
        int n=nums.length;
        k=k%n;
        int[] rotated=new int[n];
        for(int i=0;i<n;i++){
            rotated[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            rotated[(i+k)%n]=nums[i];
        }
        // nums=rotated;
        for(int i=0;i<n;i++){
            nums[i]=rotated[i];
        }

        
    }
}