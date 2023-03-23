import java.util.*;

class non_parameterised_non_returning {
    public static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int s = a + b;
        System.out.println("sum=" + s);

    }

    public static void main(String[] args) {
        sum();
    }
}
