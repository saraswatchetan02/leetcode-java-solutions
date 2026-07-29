class Solution {
    public int subtractProductAndSum(int n) {
        int pdt=1,sum=0;
        while(n>0){
         int rem=n%10;
        pdt=pdt*rem;
        sum+=rem;
        n=n/10;
    }
        return pdt-sum;
}}