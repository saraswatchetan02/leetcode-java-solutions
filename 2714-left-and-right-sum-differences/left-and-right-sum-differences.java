class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] n1= new int[nums.length];
        int [] n2= new int [nums.length];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            n1[i]=sum1;
            sum1+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            n2[i]=sum2;
            sum2+=nums[i];
        }
        for(int i=0;i<n1.length;i++){
            nums[i]=Math.abs(n1[i]-n2[i]);
        }
        return nums;
    }
}