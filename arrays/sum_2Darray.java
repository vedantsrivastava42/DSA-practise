class sum_2Darray {
    //richest customer wealth
    static void sum2d(int[][] accounts){
        int sum=0;
        int x;
        for (int[] account : accounts) {
            x = 0;
            for (int j = 0; j < account.length; j++) {
                x = x + account[j];
            }
            sum = Math.max(x, sum);

        }
   System.out.println(sum);

    }
public static void main(String[] args) {
    int[][] a={{1,2,3},{1,4,6},{4,5,8}};
    sum2d(a);
}

 
}


