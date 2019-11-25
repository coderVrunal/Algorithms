package karumachi.linkedList;

class MergeTwoListsRunner{
    public static void main(String [] args){
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        MergeTwoLists mergeObject = new MergeTwoLists();
        mergeObject.merge(head1, head2);
    }
}