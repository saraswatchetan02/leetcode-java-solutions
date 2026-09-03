class Solution {
    public boolean checkValid(int[][] matrix) {
        int p = matrix.length;
        int r = matrix[0].length;
        for (int i = 0; i < p; i++) {
            Set<Integer> set = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            for (int j = 0; j < r; j++) {
                set.add(matrix[i][j]);
                set2.add(matrix[j][i]);
            }
            if(set.size()!=p || set2.size()!=p){
                return false;
            }
        }

        return true;
    }
}