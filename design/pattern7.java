import java.util.*;

class pattern7 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = ob.nextInt();
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a = i;
            for (int j = 1; j <= n; j++) {
                if (a > n) {
                    a = 1;
                }
                System.out.print(a);
                a++;
            }

            System.out.println();
        }
    }
}
