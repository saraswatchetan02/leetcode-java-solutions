class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length, sum=0;
        int p[]=new int [n];
      for(int i=0;i<n;i++){
        sum+=nums[i];
        p[i]=sum;
      } 
      return p; 
    }
}