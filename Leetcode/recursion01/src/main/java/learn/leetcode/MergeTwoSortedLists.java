package learn.leetcode;

class MergetwoSortedLists{

    class ListNode{
        int val;
        ListNode next;
        ListNode(int value){
            val = value;
        }
    }
    public static void main(String [] args){
        
    }

    public static ListNode mergeTwoLists(ListNode h1,  ListNode h2){
        return helper( h1, h2);
    }

    public static ListNode helper( ListNode h1, ListNode h2){        
        if( h1== null)
        return h2;
        if( h2 == null )
        return h1;
        
        else if( h1.val<h2.val){
            h1.next = helper( h1.next, h2);
            return h1;
        }
        else {
            h2.next = helper( h1, h2.next);
            return h2;
        }
    }
}