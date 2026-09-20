class Solution {
    public int reverseDegree(String s) {
        int revd=0;
     for(int i=0;i<s.length();i++){
        int rev=26-(s.charAt(i)-'a');
        int stringIdx=i+1;
        revd+=rev*stringIdx;
     } 
     return revd; 
    }
}