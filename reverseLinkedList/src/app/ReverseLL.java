package app;

class ReverseLL{
    public ListNode reverse( ListNode head){
        if( head == null )
            return null;

        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while( curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;;
        }
        head = prev;
        return head;
    }
}