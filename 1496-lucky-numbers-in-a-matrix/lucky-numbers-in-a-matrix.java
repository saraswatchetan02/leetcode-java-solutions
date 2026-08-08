class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
       int N=matrix.length, M=matrix[0].length;
       ArrayList<Integer> list=new ArrayList<>();
       for(int i=0;i<N;i++){
        int rmin=Integer.MAX_VALUE;
        for(int j=0;j<M;j++){
            rmin=Math.min(rmin,matrix[i][j]);
        }
        list.add(rmin);
       } 
       ArrayList<Integer> list1=new ArrayList<>();
       for(int j=0;j<M;j++){
        int rmax=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            rmax=Math.max(rmax,matrix[i][j]);
        }
        list1.add(rmax);
       }
       ArrayList<Integer> list2=new ArrayList<>();
       for(int i=0;i<N;i++){
        for(int j=0;j<M;j++){
            if(matrix[i][j]==list.get(i) && matrix[i][j]==list1.get(j)){
                list2.add(matrix[i][j]);
            }
        }
       }
       return list2;
    }
}