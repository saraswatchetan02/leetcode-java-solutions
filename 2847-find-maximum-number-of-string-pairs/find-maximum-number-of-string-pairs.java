class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        Set<String> set=new HashSet<>();
        for(String word : words){
           String rev=""+word.charAt(1)+word.charAt(0);
           if(set.contains(rev)){
            count++;
           }
           else{
            set.add(word);
           }
            }
        return count;
    }
}