class Solution {
    public double[] convertTemperature(double celsius) {
        double ans[]=new double [2];
        double c=celsius;
        double k=c+273.15;
        double f=c*1.80+32.00;
        ans[0]=k;
        ans[1]=f;
        return ans;
    }
}