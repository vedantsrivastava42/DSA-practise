public class linearsearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 45, 12, 8 };
        int target = 45;
        System.out.println(find(arr, target, 0));
    }

    static int find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        }
        return find(arr, target, index + 1);
    }
}
