class Solution {
    public int countPartitions(int[] nums) {
        int tsum=0;
      for(int num : nums){
        tsum+=num;
      }
       int lsum=0;
       int count=0;
       for(int i=0;i<nums.length-1;i++){
        lsum+=nums[i];
        int rsum=tsum-lsum;
        if((lsum % 2) == (rsum % 2)){
            count++;
        }
       }
       return count;
    }
}