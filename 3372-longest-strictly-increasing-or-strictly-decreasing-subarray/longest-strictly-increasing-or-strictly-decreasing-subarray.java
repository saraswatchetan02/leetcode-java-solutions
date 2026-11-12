class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int inclen=1,declen=1;
       int maxlen=1;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i+1]>nums[i]){
            inclen++;
            declen=1;
        }
        else if(nums[i+1]<nums[i]){
            declen++;
            inclen=1;
        }
        else{
            declen=1;
            inclen=1;
        }
        maxlen=Math.max(maxlen,Math.max(inclen,declen));
       } 
       return maxlen;
    }
}