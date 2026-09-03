class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> list=new ArrayList<>();
       int pcount[]=new int[26];
       int num[]=new int[26];
       for(int i=0;i<p.length();i++){
        pcount[p.charAt(i)-'a']++;
       }
       int left=0;
       for(int i=0;i<s.length();i++){
        num[s.charAt(i)-'a']++;
        if(i-left+1>p.length()){
            num[s.charAt(left)-'a']--;
            left++;
        }
       if(Arrays.equals(pcount,num)){
        list.add(left);
       }
       }
       return list;
    }
}