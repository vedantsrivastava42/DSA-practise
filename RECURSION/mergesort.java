import java.util.Arrays;

class mergesort {
    public static void main(String[] args) {
        int[] arr = { 51, 62, 59, 69, 75, 81 };
        int[] ans = mergesorted(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergesorted(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergesorted(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesorted(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not finished. Add all rem.
        // element after that.
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < first.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
