class Solution {
    public boolean validDigit(int n, int x) {
        boolean flag=false;
     while(n>9){
        int rem=n%10;
        if(rem==x){
        flag=true;
        }
        n/=10;
     }
    return flag&&(n!=x);
    }
}