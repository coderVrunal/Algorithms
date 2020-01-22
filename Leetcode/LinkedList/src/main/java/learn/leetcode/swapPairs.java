package main.java.learn.leetcode;

class swapPairs{
    class ListNode {
        int val;
        ListNode next;
        public ListNode( int x){
            val = x;
        }
    }

    public ListNode swapPair(ListNode head){
        ListNode dummy = new ListNode(-1);
        if( head == null )
            return head;
        dummy.next = head;
        swap( head) ;
        return dummy.next;
    }

    public void swap(ListNode head){
        if( head == null || head.next == null )
        return;

        int temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;
        swap( head.next.next);
    }
}   