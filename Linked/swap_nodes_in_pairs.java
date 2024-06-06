public class swap_nodes_in_pairs {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode swapPairs(ListNode head) {
            ListNode dummy=new ListNode();
            dummy.next=head;
            ListNode point=dummy;
            while(point.next!=null && point.next.next!=null){
                //Initialize swap nodes
                ListNode swap1=point.next;
                ListNode swap2=point.next.next;
                //actually swap
                swap1.next=swap2.next;
                swap2.next=swap1;
                //prepare for next swap
                point.next=swap2;
                point = swap1;
            }
            return dummy.next;
        }
    }

