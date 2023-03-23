import java.util.*;
class non_parameterised_returning {
    public static int sum()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int s=a+b;
        return s;
        
    }
    public static void main(String[] args) {
      
   int z=sum();
   System.out.println("Sum="+z);
       
 
    }   
    
}
