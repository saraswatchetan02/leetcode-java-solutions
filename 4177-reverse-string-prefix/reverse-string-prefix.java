class Solution {
    public String reversePrefix(String s, int k) {
        int j=0;
      char []arr=s.toCharArray();
     while(j<k){
        char temp=arr[j];
        arr[j]=arr[k-1];
        arr[k-1]=temp;
        j++;
        k--;
      }  
      return new String(arr);
    }
}