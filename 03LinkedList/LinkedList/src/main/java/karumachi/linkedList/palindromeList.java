package karumachi.linkedList;
import java.util.*;

class PalidromeList{

    public static void main(String [] args){

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode(int v ){
            val = v;
        }
    }

    public boolean palindrome( ListNode head ){
        if( head == null )
        return false;

        ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null ){
            fast =fast.next;
            slow = slow.next;
        }

        ListNode mid = slow;
        Stack<ListNode> st= new Stack<>();

        while( head != slow ){
            st.push( head );
            head = head.next;
        }
        head = head.next;
        while(head!= null ){
            if( !st.isEmpty() && st.pop().val == head.val){
                head = head.next;
            }
            else return false;
        }
        return true;
    }
}