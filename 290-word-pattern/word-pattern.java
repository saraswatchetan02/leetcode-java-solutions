class Solution {
    public boolean wordPattern(String pattern, String s) {
        String []arr=s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
         HashSet<String> map2=new HashSet<>();
    for(int i=0;i<pattern.length();i++){
       char c=pattern.charAt(i);
       String p=arr[i];
       if(map.containsKey(c)){
        if(!map.get(c).equals(p)){
            return false;
        }}
        else{
            if(map2.contains(p)){
                return false;
            }
            map.put(c,p);
            map2.add(p);
        }
       }
    
       return true;
    }}
