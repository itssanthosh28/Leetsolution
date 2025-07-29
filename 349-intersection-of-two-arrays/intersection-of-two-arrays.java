class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1=new HashSet<>(); 
        HashSet<Integer> set2=new HashSet<>();

        for(int nums : nums1){
            set1.add(nums);
        }
        for(int nums : nums2){
            if(set1.contains(nums)){
                set2.add(nums);
            }
        }
        int [] arr=new int[set2.size()];
        int i=0;
        for(int num:set2){
            arr[i++]=num;
        }
        return arr;
    }
}