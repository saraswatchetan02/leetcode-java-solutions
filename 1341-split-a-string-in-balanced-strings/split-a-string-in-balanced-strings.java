class Solution {
    public int balancedStringSplit(String s) {
         char [] ch=s.toCharArray();
        int count=0,bal=0;
      for(int i=0;i<s.length();i++){
        if(ch[i]=='L'){
            count++;
        }else{
            count--;
        }
      if(count==0){
        bal++;
      }
      }  
      return bal;
    }
}