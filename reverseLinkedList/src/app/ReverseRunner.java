package app;

class ReverseRunner{

    public static void main(String[] args) {
        ReverseLL reverseInstance = new ReverseLL();
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = one;
        // three.next = four;
        four.next = null;
        System.out.println( printList(one) );
        System.out.println( printList(reverseInstance.reverse(one)) );
    }
    public static String printList(ListNode head){
        String out ="";
        if( head == null){
            // out = String.valueOf(head.value);
            return out;
        }
        while( head != null){
            out += head.value + " ->";
            head = head.next;
        }
        return out;
    }
}