class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int sum=0;
        int length=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=nums[i]==0?-1:1;
            if(sum==0){
                length=i+1;
            }
            else if(map.containsKey(sum)){
                length=Math.max(length,i-map.get(sum));
            }
            else{
                map.put(sum,i);
            }


      }
         return length; 
    }
}