class Solution {
    public void moveZeroes(int[] nums) {
      int l=0,r=0;
      while(r<nums.length){
        if(nums[r]!=0){
            int temp=nums[r];
            nums[r]=nums[l];
            nums[l]=temp;
            l++;
        }
        r++;
      }  
    }
}