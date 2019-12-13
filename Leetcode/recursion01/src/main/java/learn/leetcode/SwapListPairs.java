package learn.leetcode;

class SwapListPairs{
    class ListNode{
        ListNode next;
        int val;
        public ListNode(int value){
            val = value;
        }
    }
    public static void main(String [] args){

    }

    public ListNode swapLists( ListNode head){
        if( head == null )
            return head;
        ListNode dummy =head;
        swap( head );
        return dummy;
    }

    public void swap( ListNode head){
        if( head == null || head.next == null )
        return;

        int temp = head.val;
        head.val = head.next.val;
        head.next.val = temp;
        swap( head.next.next);
    }
}