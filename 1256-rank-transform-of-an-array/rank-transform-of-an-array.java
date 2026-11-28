class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int sortarr[]=arr.clone();
      Arrays.sort(sortarr);
      Map<Integer,Integer> map=new HashMap<>();;
      int currRank=1;
      for(int num:sortarr){
        if(!map.containsKey(num)){
            map.put(num,currRank++);
        }
      }  
      for(int i=0;i<arr.length;i++){
        arr[i]=map.get(arr[i]);
      }
      return arr;
    }
}