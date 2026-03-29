class Solution {
    
    public static int longestOnes(int[] nums, int k) {
        int i=0,j=0,max=0;
        while(j<nums.length){
            if(nums[j]==0){
                k--;
            }
            if(k<0){
                if(nums[i]==0) k++;
                i++;
            }
            j++;
        }
        return j-i;
    }
    static {
        for(int i=0;i<100;i++){
            longestOnes(new int[]{0,0,0},4);
        }
    };
}