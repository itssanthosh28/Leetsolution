class Solution {
    public boolean isPalindrome(int x) {
        int rev =0;
        int b = x;
        while(x>0){
        int a = x%10;
        rev = rev * 10 + a;
        x=x/10;
        }
        if(b == rev){
         return true;
        }
        return false;
  }
}