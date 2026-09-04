class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
       Arrays.sort(seats);
       Arrays.sort(students);
       int dem=0;
       for(int i=0;i<seats.length;i++){
        dem+=Math.abs(seats[i]-students[i]);
       } 
       return dem;
    }
}