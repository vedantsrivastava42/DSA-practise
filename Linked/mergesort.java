class mergesort {
    public ListNode sortList(ListNode head){
        if(head==null || head.next == null)
        return head;
ListNode mid=getMid(head);
ListNode left = sortList(head);
ListNode right=sortList(mid);
    }

    public ListNode merge(ListNode list1, ListNode list2) {
         
        ListNode temp = new ListNode(0);
        ListNode returnHead = temp;
        while(list1 !=null && list2 !=null){
            if (list1.val < list2.val) {
              temp.next = list1;
                list1 = list1.next;
            } else {
               temp.next = list2;
                list2 = list2.next;
            }
           temp = temp.next;
        }
       if(list1!=null) temp.next = list1;
      if(list2!=null) temp.next = list2;
        
        return returnHead.next;
    }
    LisNode getMid(ListNOde head){
       
            ListNode f = head;
            ListNode s = head;
            while(f!=null && f.next!=null){
                s=s.next;
                f=f.next.next;
        }
            return s;
    }
    }
    
