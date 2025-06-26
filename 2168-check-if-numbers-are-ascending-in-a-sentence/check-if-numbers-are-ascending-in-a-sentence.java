class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split(" ");
        int curr,prev=-1;
         for(int i=0;i<arr.length;i++){
             if(Character.isDigit(arr[i].charAt(0))){
               curr= Integer.parseInt(arr[i]);
               if(curr<prev || curr == prev){
                return false;
               }
               else{
                prev=curr;
               }
            }
        }
        
  return true;  }
}