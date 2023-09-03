import java.util.*;

class intro {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list =new ArrayList<>();
        // ArrayList<Boolean> list =new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // Get operation
        int element = list.get(2);
        System.out.println(element);

        // Delete - O(n)
        list.remove(2);

        // set
        list.set(2, 10);
        System.out.println(list);

        // contains
        System.out.println(list.contains(1));

        // size
        list.size();

        // print Arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

    }
}