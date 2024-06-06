/*
  Merge_In_Between_Linked_Lists
 */

import org.w3c.dom.Node;

public class Merge_In_Between_Linked_Lists {
    private Node head;
    private Node tail;
    private int size;

    // declaring size of LL
    public Merge_In_Between_Linked_Lists() {
        this.size = 0;
    }
 public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
}

