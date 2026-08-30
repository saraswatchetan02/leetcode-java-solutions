import java.util.*;
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int row1 = nums1.length;
        int row2 = nums2.length;
        for (int i = 0; i < row1; i++) {
            map.put(nums1[i][0], nums1[i][1]);
        }
        for (int i = 0; i < row2; i++) {
            map.put(nums2[i][0], map.getOrDefault(nums2[i][0], 0) + nums2[i][1]);
        }
        int ans[][] = new int[map.size()][2];
        ArrayList<Integer> keys = new ArrayList<>(map.keySet());
 Collections.sort(keys);
        for (int j = 0; j < keys.size(); j++) {
            int key = keys.get(j);
            ans[j][0] = key;
            ans[j][1] = map.get(key);
        }
        return ans;
    }

}
