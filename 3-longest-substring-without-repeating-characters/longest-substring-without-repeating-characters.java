class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character,Integer> map=new HashMap<>();
        int n=s.length();
        int max=0,i=0,j=0;
        while(j<n){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                i=Math.max(map.get(ch)+1,i);
            }
            max=Math.max(max,j-i+1);
            map.put(ch,j);
            j++;     
        }

    return max;    
    }
}