class Solution {
public static void combinations(int ind,int []arr,int target,List<List<Integer>> ans,List<Integer> temp){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(temp));
            }
            return;   
        }
        if(arr[ind]<=target){
        temp.add(arr[ind]);
        combinations(ind,arr,target-arr[ind],ans,temp);
        temp.remove(temp.size()-1);
        }
        combinations(ind+1,arr,target,ans,temp);
    }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans =new ArrayList<>();
        combinations(0,candidates,target,ans,new ArrayList<>());
        return ans;     
    }
}