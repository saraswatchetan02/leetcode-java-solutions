class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     HashMap<Integer,Integer> map=new HashMap<>();
     for(int x:arr){
        map.put(x,map.getOrDefault(x,0)+1);
     }   
     Set<Integer> set=new HashSet<>();
     for(int x:map.values()){
        set.add(x);
     }
     return set.size()==map.size();
    }
}