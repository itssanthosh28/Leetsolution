class Solution {
    public void rotate(int[] nums, int k) {
         int n=nums.length;
        // k=k%n;
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
        // int n=nums.length;
        // k=k%n;
        // int[] rotated=new int[n];
        // for(int i=0;i<n;i++){
        //     rotated[i]=nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     rotated[(i+k)%n]=nums[i];
        // }
        // // nums=rotated;
        // for(int i=0;i<n;i++){
        //     nums[i]=rotated[i];
        // }
        if (k>n){
        k=k%n;
        }
    //      reverse(nums,0,k);
    //      reverse(nums,k+1,n-1);
    //      reverse(nums,0,n-1);      
    // }
         reverse(nums,0,n-1);
         reverse(nums,0,k-1);
         reverse(nums,k,n-1);      
    }
    public static void reverse(int[]arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}