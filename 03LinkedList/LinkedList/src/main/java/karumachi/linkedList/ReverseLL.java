package karumachi.linkedList;

import karumachi.linkedList.ListNode;


class ReverseLL{
    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        head.next =new ListNode(1);
        head = head.next;
        head.next =new ListNode(2);
        head = head.next;
        head.next =new ListNode(3);
        head = head.next;
        head.next =new ListNode(4);
        head = head.next;
        head.next =new ListNode(5);
        head = head.next;
        ListNode temp = reverseRecurse(curr);
        while( temp!= null){
            System.out.println( temp.value);
            temp = temp.next;
        }
    }

    
        // ideas:
        // Use stack and reverse
        // Iteratively change pointers to prevs
        // Change recursively

    public static ListNode reverseIterative(ListNode input){
        if( input == null )
            return null;

        ListNode prev = null;
        ListNode curr = input;
        ListNode next = null;

        while( curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }


    public static ListNode reverseRecurse( ListNode node){
        if( node == null || node.next == null )
            return node;

        ListNode p = reverseRecurse( node.next);
        node.next.next = node;
        node.next = null;
        return p;
    }
}