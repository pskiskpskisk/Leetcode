class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n=spells.length,m=potions.length;
        for(int i=0;i<n;i++){
            int l=0,r=m-1;
            while(l<=r){
                int mid=l+(r-l)/2 ;
                long p=potions[mid]*(long)spells[i];
                if(p>=success){
                    r=mid-1;
                }else{
                    l=mid+1;
                }
            }
            spells[i]=m-l;
        }
        return spells;
    }
}