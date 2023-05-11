public class Main {
    public static void main(String[] args) {

        // SINGLY LINKEDLIST
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertFirst(15);
        list.insertLast(9);
        list.insert(100, 3);

        // list.display();
        // System.out.println(list.deleteFirst());
        // list.display();
        // System.out.println(list.deleteLast());
        // list.display();
        // System.out.println(list.delete(3));
        list.display();
        list.insertRec(88, 2);
        list.display();
        // System.out.println( list.find(60));

        // DOUBLY LINKEDLIST
        // DoublyLL list = new DoublyLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertFirst(15);
        // list.insertLast(99);
        // list.insert(3, 101);
        // list.display();

        // CIRCULAR LINKEDLIST
        // circularLL list = new circularLL();
        // list.insert(100);
        // list.insert(25);
        // list.insert(3);
        // list.insert(8);
        // list.display();
        // list.delete(3);
        // list.display();
    }
}
