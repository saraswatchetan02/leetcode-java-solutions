class Solution {
    public int countDigits(int num) {
      int c =0; 
     int  temp=num;
      while(num>0){
    
        int rem=num%10;
    if(temp%rem==0){
        c++;
    }
    num/=10;
      }
      return c; 
    }
}