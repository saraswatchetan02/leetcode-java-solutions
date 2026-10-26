class Solution {
    public int maxPower(String s) {
        int max=1;
        int count=1;
        for(int i=1;i<s.length();i++){
            char ch=s.charAt(i);
            char pr=s.charAt(i-1);
            if(ch==pr){
                count++;
            }
            else{
                count=1;
            }
                max=Math.max(max,count);
        }
        return max;
    }
}