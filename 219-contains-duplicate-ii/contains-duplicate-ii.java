class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer,Integer> seen =new HashMap<>();
        int n=nums.length-1;
        for(int i=0;i<=n;i++){
            int val=nums[i];
            if(seen.containsKey(val)&& i-seen.get(val)<=k){
                return true;
            }
            seen.put(val,i);
        }
   return false;     
    }
}