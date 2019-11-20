import java.util.*;


/*
Least recently used cache
Build library using Doubly LinkedList
and HashMap

operations:
get(int key) : T: O(1)

set( int key, int value) : T: O(1)
*/

class LRU{
    class DList{
        String value;
        String key;
        DList next;
        DList prev;
    }

    DList head , tail;
    HashMap<String, DList> map;
    int size;
    public LRU( int capacity ){
        head = new DList();
        tail = new DList();
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
        size = capacity;
    }

    private void addNode(DList node){
        head.next.prev = node;
        head.next = node; 
        node.next = head.next;
        node.prev = head;
    }


    private void removeNode(DList node){
        DList next= node.next;
        DList prev = node.prev;
        next.prev = prev;
        prev.next = next;
    }

    private void moveToHead(DList node) {
        removeNode(node);
        addNode(node);
    }

    private DList popFromTail(){    
        DList temp = tail.prev;
        removeNode(temp);
        return temp;
    
    }

    public String get(String key ){
        if( map.containsKey(key)){
            moveToHead(map.get(key) );
            return map.get(key).value;
        }
        return null;
    }
    public void set(String  key, String value){
        if( map.containsKey( key )){
            DList temp = map.get( key );
            temp.value = value;
            map.put( key, temp );
            moveToHead(temp);
        }
        else{
            DList n = new DList();
            addNode(n);
            map.put( key, n);
            if( map.size() > size){
                DList temp = popFromTail();
            }
        }
    }

    
    public static void main(String [] args){
        System.out.println( "Hello World");
        LRU lru = new LRU( 2 );
        lru.set( "alpha", "hello" );
        lru.set( "beta", "world");
        lru.set( "gamma", "!");
    }
}




