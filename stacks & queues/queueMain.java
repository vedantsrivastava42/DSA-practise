public class queueMain {
    public static void main(String[] args) throws Exception {
        circularQueue queue = new circularQueue(5);
        queue.insert(34);
        queue.insert(21);
        queue.insert(33);
        queue.insert(64);
        queue.insert(6);

        queue.display();

        System.out.println(queue.remove());
        queue.insert(133);
        queue.display();
    }
}
