class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }

         if(index==-1){
            reverse(nums,0,n-1);
            
        }
        else{
        for(int i=n-1;i>=index;i--){
            if(nums[i]>nums[index]){
                swap(nums,index,i);
                break;
            }
          }
          reverse(nums,index+1,n-1);
        }  
    }
      private static void reverse(int[] arr,int i,int j){
        while(i<j){
                int temp=arr[i];
                arr[i++]=arr[j];
                arr[j--]=temp;    
        }    
    }
      private static void swap(int[] arr,int i,int j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;       
    }
}