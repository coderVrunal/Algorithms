package karumachi.linkedList;
class MergeTwoLists{
    public ListNode merge( ListNode head1 , ListNode head2){
        if( head1 == null && head2 == null)
            return null;
        ListNode head= new ListNode(0);
        ListNode dummy = head;
        while( head1 != null && head2 != null){
            int val = 0;
            if( head1.value < head2.value ){
                val = head1.value;
            }else{
                val = head2.value;
            }
            head.next = new ListNode(val);
            head =head.next;
        }
        if( head1 != null){
            head.next = head1;
        }
        if( head2 != null ){
            head.next = head2;
        }

        return dummy.next;
    }
}