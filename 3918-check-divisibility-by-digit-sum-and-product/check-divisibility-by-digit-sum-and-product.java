class Solution {
    public boolean checkDivisibility(int n) {
        int org=n;
        int sum=0,pdt=1,sum1=0;
       while(n!=0){
        int rem=n%10;
        sum+=rem;
        pdt*=rem;
        n=n/10;
       } 
       sum1=sum+pdt;
       if(org%sum1==0){
        return true;
       }
       return false;

    }
}