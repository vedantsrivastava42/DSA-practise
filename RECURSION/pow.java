class pow {
    public static double myPow(double x,double ans, int n) {
        if(n<=0)
        return ans;
        ans=ans*x;
        return myPow(x,ans,n-1);
      }
      public static void main(String[] args) {
        System.out.println(myPow(2.0,1.0,5));
      }
}
