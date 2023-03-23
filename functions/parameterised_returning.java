import java.util.Scanner;

class parameterised_returning 
{
 public static int sum(int x,int y)
 {
    int s=x+y;
    return s;
 }
 public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("enter 2 numbers");
    int a=in.nextInt();
    int b=in.nextInt();
    int z=sum(a,b);
    System.out.println("sum="+z);
    in.close();

    

 }   
}
