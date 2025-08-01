class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int l=0,r=0,max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<n){
            char ch=s.charAt(r);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                max+=(n-r);
                char ch1=s.charAt(l);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0){
                    map.remove(ch1);
                }
                 l++;
            }
            r++;
        }
   return max;     
    }
}