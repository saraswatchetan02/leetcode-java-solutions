class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi=0;
        for(int nums: candies){
            maxi=Math.max(maxi,nums);
        }
       ArrayList<Boolean> kids=new ArrayList<>();
       for(int i=0;i<candies.length;i++){
        if(candies[i]+extraCandies >=maxi){
            kids.add(true);
        }
        else{
            kids.add(false);
        }
       }
       return kids;
    }
}