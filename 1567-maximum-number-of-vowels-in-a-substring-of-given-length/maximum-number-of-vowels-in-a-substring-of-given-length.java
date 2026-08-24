class Solution {
    public int maxVowels(String s, int k) {
     char []arr=s.toCharArray();
     String s1="aeiouAEIOU";
     int count=0;
     for(int i=0;i<k;i++){
        if(s1.indexOf(s.charAt(i))!=-1){
        count++;
     }   
    }
    int max=count;
    for(int i=k;i<s.length();i++){
        if(s1.indexOf(s.charAt(i-k))!=-1){
            count--;
        }
        if(s1.indexOf(s.charAt(i))!=-1){
            count++;
        }
        max=Math.max(max,count);
    }
    return max;
}}