class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=n+m;
        int[] arr= new int[k];
        for(int i=0;i<n;i++)arr[i]=nums1[i];
        for(int i=0;i<m;i++)arr[n+i]=nums2[i];
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        int mid = left+(right-left)/2;
        if(k%2==1){
            return arr[mid];
             
            }
        else{
            return (double )(arr[mid]+arr[mid+1])/2;
           
            
        }
        
    }
}