class Solution {
    public int compress(char[] chars) {
        int n=chars.length;  
        int index=0;
        int i=0;
        while(i<n){
           char ch=chars[i]; 
            int count=0;
            while(i<n && chars[i]==ch){
                count++;
                i++;
            }
            chars[index]=ch;
            index++;
            if(count>1){
                String str=String.valueOf(count);
                for(char pr : str.toCharArray()){
                    chars[index]=pr;
                    index++;
                }
            }
        }
        return index;
    }
}