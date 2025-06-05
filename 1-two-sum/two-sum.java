class Solution {
    public int[] twoSum(int[] nums, int target) {
        // // int arr[]=new int[2];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //          arr[0]=i;
        //          arr[1]=j;
                  //}
                //   }
                //   }
                //   return arr;
    // }
    // }
    

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int pair=target-nums[i];
            if(map.containsKey(pair)){
                return new int[]{map.get(pair),i};
            }
            map.put(nums[i],i);
        }
        
  return new int[]{};  }
}