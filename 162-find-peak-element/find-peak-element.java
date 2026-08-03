class Solution {
    public int findPeakElement(int[] nums) {
     int n= nums.length-1;
     int p=0;
    while(p<n){
        int mid=p+(n-p)/2;
        if(nums[mid]>nums[mid+1]){
            n=mid;
        }
        else{
           p=mid+1;
        }
     } 
     return n;
   
    }
}