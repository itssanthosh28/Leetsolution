class Solution {
    public int totalFruit(int[] fruits) {
        HashMap <Integer,Integer> map =new HashMap<>();
        int l=0,r=0;
        int n=fruits.length;
        int k=2,max=0;
        
        while(r<n){
            int a=fruits[r];
            map.put(a,map.getOrDefault(a,0)+1);
                while(map.size()>k){
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){
                    map.remove(fruits[l]);
                }
                l++;
                }
            
            max=Math.max(max,r-l+1);
            r++;
            
        }
        // for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        //     if(entry.getValue()>max1){
        //         max2=max1;
        //         max1=entry.getValue();
        //     }
        //     else if(entry.getValue()>max2){
        //         max2=entry.getValue();
        //     }

        // }
     return max;   
    }
}