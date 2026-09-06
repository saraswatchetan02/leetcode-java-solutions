class Solution {
    public int pivotInteger(int n) {
        int tsum=n*(n+1)/2;
    int p=(int)Math.sqrt(tsum);
    if(p*p==tsum){
        return p;
    }
    return -1;
    }
}