class happy {
    public static void main(String[] args) {
     int a=7;
     int sum;
     while(a>9){
        sum=0;
        while(a>0){
            int d=a%10;
            sum=sum+(d*d);
            a=a/10;
        }
      a=sum;
     }
     if(a == 1){
       System.out.println("happy number");
     }
     else
     System.out.println("not happy number");

    }
}
