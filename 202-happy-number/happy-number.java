class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> list =new ArrayList<>();
       
        while(n!=1){
             n=digitsquare(n);
            if(list.contains(n)){
                return false;
            }
                list.add(n);                     
        }
       return true;
        
    }
    // int slow=n;
    // int fast=n;
    // do{
    // slow=digitsquare(slow);
    // fast=digitsquare(digitsquare(fast));
    // }while(slow!=fast);
    // if(slow==1)return true;
    // return false;
    // }

    

    public static int digitsquare(int n){
        int squaresum=0;
        while(n>0){
            int a=n%10;
           // squaresum+=Math.pow(a,2);
           squaresum+=a*a;
            n=n/10;
        }
   return squaresum;
    }
}