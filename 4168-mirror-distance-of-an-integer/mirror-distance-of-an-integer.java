class Solution {
    public int mirrorDistance(int n) {
        int mirror=0;
        int temp=n;
      while(n>0){
        int rem=n%10;
    mirror=mirror*10+rem;
    n/=10;
      }  
      return Math.abs(temp-mirror);
    }
}