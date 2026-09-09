class Solution {
    public String minWindow(String s, String t) {
      int freq[]=new int[128];
      for(char ch: t.toCharArray()){
        freq[ch]++;
      }
      int left=0;
      int right=0;
      int count=0;
      int minlen=Integer.MAX_VALUE;
      int start=0;
      while(right<s.length()){
        char ch=s.charAt(right);
        if(freq[ch]>0){
            count++;
        }
        freq[ch]--;
        right++;
        while(count==t.length()){
            if(right-left<minlen){
                minlen=right-left;
                start=left;
            }
            char lchar=s.charAt(left);
            freq[lchar]++;
            if(freq[lchar]>0){
                count--;
            }
            left++;
        }
        }
        if(minlen==Integer.MAX_VALUE){
            return "";
      }
        return s.substring(start,start+minlen);
    }
}