class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n=nums.length;
        int max=0;
        int result=0;
        int start=0;
        Set<Integer> set =new HashSet<>();
        for(int i=0;i<n;i++){
           while(set.contains(nums[i])){
            set.remove(nums[start]);
            max-=nums[start];
            start++;
           }
           max+=nums[i];
           set.add(nums[i]);
        result=Math.max(result,max);
        }
        return result;
    }
}