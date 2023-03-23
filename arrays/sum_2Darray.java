class sum_2Darray {
    //richest customer wealth
    static void sum2d(int[][] accounts){
        int sum=0;
        int x;
    for(int i=0;i<accounts.length;i++){
    x=0;
    for(int j=0;j<accounts[i].length;j++){
        x=x+accounts[i][j];
    }
    sum=Math.max(x,sum);

    }
   System.out.println(sum);

    }
public static void main(String[] args) {
    int[][] a={{1,2,3},{1,4,6},{4,5,8}};
    sum2d(a);
}

 
}


