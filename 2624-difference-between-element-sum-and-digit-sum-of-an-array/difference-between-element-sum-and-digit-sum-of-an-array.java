class Solution {
    public int differenceOfSum(int[] nums) {
        int dsum=0;
        int esum=0;
        for(int i=0;i<nums.length;i++){
            esum+=nums[i];
        while(nums[i]>0){
            int rem=nums[i]%10;
            dsum+=rem;
        nums[i]/=10;
        }}
        
        int diff=esum-dsum;
        return Math.abs(diff);
    }
}