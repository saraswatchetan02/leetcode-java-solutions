class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        if (k <= 1)
            return 0;
        int pdt = 1;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            pdt *= nums[right];
            while (pdt >= k) {
                pdt /= nums[left++];
            }
            count += right - left + 1;
        }
        return count;
    }
}