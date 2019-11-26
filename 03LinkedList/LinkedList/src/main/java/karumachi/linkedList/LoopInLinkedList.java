package karumachi.linkedList;
import karumachi.linkedList.ListNode;


class LoopInLinkedList{
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
        head.next =head;
        // head = head.next;
        System.out.println( loopInLL(curr));
        System.out.println( lengthOfLoop(curr));
        
    }

    public static boolean loopInLL(ListNode input ){
        // Idea use two pointer 
        // Fast and slow pointer
        // Such that if loop exists it would meet within the loop 

        ListNode fast = input;
        ListNode slow = input;

        while( fast!= null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if( fast == slow){
                return true;
            }
        }
        return false;
    }

    public static int lengthOfLoop(ListNode input){
        ListNode fast = input;
        ListNode slow = input;
        boolean loop = false;
        while( fast!= null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if( fast == slow){
                loop =true;
                break;
            }
        }
        int length =0;
        if( loop){
            do {
                slow = slow.next;
                length++;
            }
            while( slow != fast);
        }
        return length;
    }
}