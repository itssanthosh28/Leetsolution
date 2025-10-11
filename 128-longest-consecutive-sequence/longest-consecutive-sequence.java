class Solution {
    public int longestConsecutive(int[] nums) {
        // if(nums.length==0)return 0;
        // TreeSet<Integer> set = new TreeSet<>();
        // for(int num:nums){
        //     set.add(num);
        // }
        // int max=1;
        // int c=1;
        // for(int num:set){
        //     if(set.contains(num+1)){
        //         c+=1;
        //     }
        //     else{
        //         c=1;
        //     }
        //     max=Math.max(c,max);
        // }
        // return max; output successful but slower
        if (nums.length==0) return 0;
        Arrays.sort(nums);
        int n=nums.length;
        int max=1,c=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            else if(nums[i]+1==nums[i+1]){
                c+=1;
            }
            else{
                c=1;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}