class Solution {
    public int maxArea(int[] h) {
        int l=0,r=h.length-1,max=0;
        while(l<r){
            max=Math.max(max,calc(Math.min(h[l],h[r]),r-l));
            if (h[l] < h[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }
    private int calc(int l, int b){
        return l*b;
    }
}