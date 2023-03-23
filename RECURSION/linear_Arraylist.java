import java.util.ArrayList;

public class linear_Arraylist {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 45, 45, 12, 8 };
        int target = 45;
        // output for ArrayList with argument
        ArrayList<Integer> ans = (find(arr, target, 0, new ArrayList<>()));
        System.out.println(ans);
        // output for ArrayList without argument
        System.out.println(find2(arr, 45, 0));
    }

    // using arraylist as an argument
    static ArrayList<Integer> find(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return find(arr, target, index + 1, list);

    }

    // without using ArrayList as an argument
    static ArrayList<Integer> find2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfrombelowCalls = find2(arr, target, index + 1);
        list.addAll(ansfrombelowCalls);
        return list;

    }
}
