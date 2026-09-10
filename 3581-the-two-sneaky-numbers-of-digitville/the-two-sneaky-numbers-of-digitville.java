class Solution {
    public int[] getSneakyNumbers(int[] nums) {
       Set<Integer> seen = new HashSet<>();
        int[] sneaky = new int[2];
        int index = 0;       
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                sneaky[index] = nums[i];
                index++;
                if (index == 2) {
                    break;
                }
            } else {
                seen.add(nums[i]);
            }
        }  
        return sneaky;
    }
}