class Solution {
    public int[] rearrangeArray(int[] nums) {
     int n=nums.length;
    int arr[]=new int [n];
    int start=0;
    int end=1;
    for(int num:nums){
        if(num>0){
            arr[start]=num;
            start+=2;
        }
        else{
            arr[end]=num;
            end+=2;
        }
    }
        return arr;
    }
}