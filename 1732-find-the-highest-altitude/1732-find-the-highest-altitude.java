class Solution {
    public int largestAltitude(int[] gain) {
        int res=0,curr=0;
        for(int i=0;i<gain.length;i++){
            curr+=gain[i];
            res=Math.max(res,curr);
        }
        return res;
    }
}