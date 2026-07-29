class Solution {
    public boolean isSameAfterReversals(int num) {
       if(num<9) 
    {
     return true;
    }
     String s=String.valueOf(num);
     if(s.endsWith("0")){
        return false;
    }
    return true;
}}