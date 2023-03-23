import java.util.*;
class parameterised_non_returning {
    public static void sum(int x,int y)
    {
       int s=x+y;
       System.out.println("sum="+s);
    }
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("enter 2 numbers");
       int a=in.nextInt();
       int b=in.nextInt();
       sum(a,b);
    in.close();
    }   
}
