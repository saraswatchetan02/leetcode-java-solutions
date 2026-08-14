class Solution {
    public int maximumLengthSubstring(String s) {
        int [] arr=new int[26];
        int l=0,res=0;
     for(int i=0;i<s.length();i++){
        int p=s.charAt(i)-'a';
        arr[p]++;
        while(arr[p]>2){
            int p2=s.charAt(l)-'a';
            arr[p2]--;
            l++;
        }
        res=Math.max(res,i-l+1);
        }
        return res;
     }   
    }
