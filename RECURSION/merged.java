import java.util.Arrays;

public class merged {
    public static void main(String[] args) {
        int[] arr = { 51, 62, 59, 69, 75, 81 };
        mergeinplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeinplace(int[] arr, int s, int e) {
        if ((e - s) == 1) {
            return;
        }
        int m = (s + e) / 2;
        mergeinplace(arr, s, m);
        mergeinplace(arr, m, e);
        merge(arr, s, m, e);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;
        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
                k++;
            } else {
                mix[k] = arr[j];
                j++;
                k++;
            }

        }
        // it may be possible that one of the array is not finished. Add all rem.
        // element after that.
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }

}
