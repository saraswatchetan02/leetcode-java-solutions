class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
     for(int i=0;i<n;i++){
        nums[i]=nums[i]*nums[i];
     }   
     Arrays.sort(nums);
     long lsum=0;
     long ssum=0;
     for(int i=0;i<n/2;i++){
        ssum+=nums[i];
     }
     for(int i=n/2;i<n;i++){
        lsum+=nums[i];
     }
     return lsum-ssum;
    }
}