import java.util.*;
class tostring
{
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0;i<5;i++)
        arr[i]=in.nextInt();
        System.out.println(Arrays.toString(arr));
       for (int i=0;i<5;i++)
       System.out.print(arr[i]+" ");
    }
} 