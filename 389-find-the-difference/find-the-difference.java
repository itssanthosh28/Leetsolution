class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(char a :t.toCharArray()){
            map.put(a,map.getOrDefault(a,0)+1);
        }
         
        for(char b : s.toCharArray()){
            map.put(b,map.getOrDefault(b,0)-1);
        }
        for(char c : map.keySet()){
            if(map.get(c)==1){
            return c;
            }
        }

    return ' ';    
        
    }
}
