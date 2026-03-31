class Solution {
    public int equalPairs(int[][] grid) {
        Map<List<Integer>,Integer> mp = new HashMap<>();
        int n=grid.length,m=grid[0].length;
        for(int[] i : grid){
            List<Integer> arr = new ArrayList<>();
            for(int j : i){
                arr.add(j);
            }
            mp.put(arr,mp.getOrDefault(arr,0)+1);
        }
        int c=0;
        for(int i=0;i<m;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j=0;j<n;j++){
                arr.add(grid[j][i]);
            }
            if(mp.containsKey(arr)){
                c+=mp.get(arr);
            }
        }
        return c;
    }
}