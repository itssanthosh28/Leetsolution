class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=firstindex(nums,target);
        int last=lastindex(nums,target);
        return new int[]{first,last};
        }
    
    

    private int firstindex(int[] nums ,int target){
        int left=0,right=nums.length-1,index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
                 }
            else{
                right=mid-1;
        }
         }
          return index;  
          }
    
         private int lastindex(int[] nums ,int target){
        int left=0,right=nums.length-1,index=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                index=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
                 }
            else{
                right=mid-1;
        }
        }
        return index;
    }
}
  
