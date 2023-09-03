import java.util.*;

class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(1);
        list.add(9);
        Collections.sort(list);
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}