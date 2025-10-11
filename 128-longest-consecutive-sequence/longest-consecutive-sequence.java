class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)return 0;
        TreeSet<Integer> set = new TreeSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=1;
        int c=1;
        for(int num:set){
            if(set.contains(num+1)){
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