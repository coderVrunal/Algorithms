package app;

public class App {
    public static void main(String[] args) throws Exception {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = null;

        System.out.println( printList( new ReverseLL().reverse(one) )) ;
    }

    public static String printList(ListNode head){
        String out ="";
        if( head != null){
            out = String.valueOf(head.value);
        }
        while( head.next != null){
            out += String.valueOf(head.value )+ " ->";
            head = head.next;
        }
        return out;
    }
}