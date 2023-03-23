import java.util.*;
class bubblesort {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        int temp=0;
        int a[]=new int[10];
        System.out.println("Enter 10 numbers");
        for (int i=0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a.length-1-i;j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }  
        }
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+"  ");   
            ob.close();
    }    
}
