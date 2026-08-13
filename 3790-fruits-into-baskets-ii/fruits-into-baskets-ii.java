class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int remain=0;
       for(int i=0;i<fruits.length;i++){
        boolean place=false;
        for(int j=0;j<fruits.length;j++){
        if(baskets[j]>=fruits[i]){
            place=true;
            baskets[j]=-1;
            break;
        }}
        if(!place){
            remain++;
        }
        
    }
    return remain;
}}