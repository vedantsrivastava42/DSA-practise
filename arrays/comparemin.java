public class comparemin {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 4, 7 };
        int[] arr2 = { 5, 7, 1, 6, 9 };
        int min1 = arr1[0];
        int min2 = arr2[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                if (arr1[i] < min1)
                    min1 = arr1[i];
                if (arr2[i] < min2)
                    min2 = arr2[i];
            }

        }
        System.out.println(min1 + min2);
    }
}