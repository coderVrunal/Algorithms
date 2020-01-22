package main.java.learn.leetcode;

class MergeKSortedList{

    class ListNode{
        ListNode next;
        int val;
        public ListNode(int v){
            val = v; 
        }
    }

    public ListNode mergeKSortMergeSort( ListNode [] list){

    }

    public ListNode mergeKSortedPQ( ListNode [] list){
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode> ( (a,b) -> a.val-b.val);
        for(int i=0 ; i< list.length; i++){
            pq.offer( list[i]);
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while( !pq.isEmpty() ){
            ListNode node = pq.poll();
            curr.next = node;
            curr  = curr.next;
            if( curr.next != null ){
                pq.offer( curr );
            }
        }
        return dummy.next;
    }
}


