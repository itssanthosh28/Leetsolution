class Solution {
    public int[] rearrangeArray(int[] nums) {
        if(nums.length==1)return nums;
        int n=nums.length;
        int s=n/2;
        int[] pos=new int[s];
        int[] neg=new  int[s];
        int j=0,k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[j++]=nums[i];
            }
            else{
                neg[k++]=nums[i];
            }
    }
    j=0;
    k=0;
    for(int i=0;i<n;i++){
        if(i%2==0){
            nums[i]=pos[j++];
        }
        else{
            nums[i]=neg[k++];
        }
    }
        
    return nums;}
}