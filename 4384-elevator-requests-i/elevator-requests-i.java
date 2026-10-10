class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sum=0;
        int floor=0;
      for(int i=0;i<requests.length;i++){
        sum+=Math.abs(requests[i]-floor);
        floor=requests[i];
      }  
      return sum;
    }
}