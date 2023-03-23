import java.util.*;

class max_element {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int maxval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxval)
                maxval = arr[i];
        }
        return maxval;
    }
}
