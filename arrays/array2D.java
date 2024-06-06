class array2D {
    public static void modifiedMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<n;i++){
          int max=Integer.MIN_VALUE;
          //Max value from the column
          for(int j=0;j<m;j++){
              max=Math.max(max,matrix[j][i]);
          }
          
            for(int j=0; j<m ; j++){
              if(matrix[j][i] == -1)
              matrix[j][i]=max;
            }
      }
      for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
      }
    }
public static void main(String[] args) {
    int[][] a={{1,2,-1},{4,-1,6},{7,8,9},{-1,4,5}};
    modifiedMatrix(a);
}
}
