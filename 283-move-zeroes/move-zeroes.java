class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        // int j =0;
        // for(int i = 0; i<nums.length; i++){
        //     if (nums[i] != 0){
        //         int tmp = nums[i];
        //         nums[i] =  nums[j];
        //         nums[j] = tmp;
        //         j++;
                

        //     }     
        // }
        if(nums.length==1) return;
        int j=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0 && i==n-1)return;
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
        }
       
       
    }
     public static void swap(int[] nums,int i,int j){
            int temp=nums[i];
             nums[i]=nums[j];
            nums[j]=temp;
            
        }
}