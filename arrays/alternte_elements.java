import java.util.*;

class alternte_elements {
    public static void print(int arr[], int n) {
        int i;

        for (i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter length of array  ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("enter elements arrays  ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        print(arr, n);
    }
}
