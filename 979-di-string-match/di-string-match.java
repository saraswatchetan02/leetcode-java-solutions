class Solution {
    public int[] diStringMatch(String s) {
       int n=s.length();
       int []nums=new int[n+1];
       int low=0;
       int high=n;
       for(int i=0;i<n;i++){
        if(s.charAt(i)=='I'){
            nums[i]=low++;
        }
        else{
            nums[i]=high--;
        }
       }
       nums[n]=low;
       return nums; 
    }
}