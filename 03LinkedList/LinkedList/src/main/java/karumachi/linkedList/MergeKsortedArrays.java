package karumachi.linkedList;

import java.util.PriorityQueue;

import karumachi.linkedList.ListNode;

class MergeKSortedArrays{
    public static void main(String args[] ){

    }
    
    public static ListNode mergeKByPriorityQ( ListNode[] input) {
        if( input == null || input.length == 0)
            return null;
        ListNode head = new ListNode(0);
        ListNode dummy = head;

        // To do Merging K Nodes
        
        // Ideas: Use a PQ of size K
        // When Poll smallest element and push the next element of its list 
        PriorityQueue<ListNode> pq = new PriorityQueue<>( (a,b) -> a.value-b.value);
        for ( ListNode node : input){
            pq.add( node);
        }

        while( pq.isEmpty()){
            ListNode temp = pq.poll();
            head.next = temp;
            head = head.next;
            if( temp.next != null){
                pq.add(temp.next);
            }
        }
        return dummy.next;
    }
}