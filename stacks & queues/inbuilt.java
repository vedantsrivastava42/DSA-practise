import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;

class inbuilt {
    public static void main(String[] args) {
        // Stack
        // Stack<Integer> stack = new Stack<>();
        // stack.push(34);
        // stack.push(4);
        // stack.push(86);
        // stack.push(93);
        // stack.push(33);

        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

        // Queue
        // Queue<Integer> queue = new LinkedList<>();
        // queue.add(34);
        // queue.add(21);
        // queue.add(33);
        // queue.add(64);
        // queue.add(6);

        // System.out.println(queue.peek());
        // System.out.println(queue.remove());
        // System.out.println(queue.remove());

        // Deque
        Deque<Integer> deque = new ArrayDeque<>();
        // deque.add(89);
        // deque.addLast(79);
        // deque.removeFirst();
        // System.out.println(peekFirst());

        deque.addFirst(1);
        deque.addLast(2);
        int first = deque.removeFirst();
        int last = deque.removeLast();
        System.out.println("First: " + first + ", Last: " + last);
    }
}
