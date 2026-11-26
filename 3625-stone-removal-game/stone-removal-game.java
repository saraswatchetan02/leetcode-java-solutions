class Solution {
    public boolean canAliceWin(int n) {
        int total=0;
        int moves=0;
        for(int i=10;i>=1;i--){
            total+=i;
            if(total>n){
                break;
            }
            moves++;
        }
        return moves%2==1;
    }
}