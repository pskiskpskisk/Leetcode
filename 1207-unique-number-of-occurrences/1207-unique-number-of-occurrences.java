class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         Map<Integer,Integer> mp=new HashMap<>();
         for(int i : arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
         }
         Map<Integer,Integer> res=new HashMap<>();
         for(Map.Entry<Integer,Integer> i : mp.entrySet()){
            int val=i.getValue();
            if(res.containsKey(val)) return false;
            res.put(val,0);
         }
         return true;
    }
}