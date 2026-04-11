class Solution {
    public int minimumDistance(int[] nums) {
        if(nums.length<3){
            return -1;
        }
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.computeIfAbsent(nums[i],k -> new ArrayList<>()).add(i);
        }
        int min=Integer.MAX_VALUE;
        for(List<Integer> i : mp.values()){
            if(i.size()<3) continue;
            for(int j=0; j<=i.size()-3; j++){
                int sum = Math.abs(i.get(j+2)-i.get(j+1))+Math.abs(i.get(j+1)-i.get(j))+Math.abs(i.get(j)-i.get(j+2));
                min = Math.min(min,sum);
            }
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}