class sum2d {
    public static void main(String[] args) {
        int sum=0;
        int a;
        int[][] accounts={{1,2,3},{1,4,6,654},{4,5,8}};
        
        for(int i=0;i<accounts.length;i++){
           a=0;
            
        for(int j=0;j<accounts[i].length;j++){
      a=a+accounts[i][j];   
    }
   sum=Math.max(sum,a);
    }   
    System.out.println(sum);    
}
}
   
    

