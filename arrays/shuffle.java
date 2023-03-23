import java.util.Arrays;
import java.util.*;

class shuffle {
public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]={1,2,3,4,1,2,3,4};
    int ans[]=new int[2*n];
    for(int i=0;i<n;i++){
        ans[2*i]=a[i];
        ans[2*i+1]=a[i+n];
    }
    System.out.println(Arrays.toString(ans));
    }
}

