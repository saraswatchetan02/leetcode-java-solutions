class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0;
        int pdt=1;
       while(n!=0){
        int rem=n%10;
        sum+=rem;
        pdt*=rem;
        n=n/10;
       } 
      int sum1=sum+pdt;
       if(org%sum1==0){
        return true;
       }
       return false;

    }
}