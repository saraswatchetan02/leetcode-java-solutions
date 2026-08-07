class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> list=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            list.add(nums[i]);
        }
        ArrayList<Integer> ldt=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(list.contains(i)==false){
                ldt.add(i);
            }
        }
        return ldt;
    }
}