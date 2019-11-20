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
        DList next;
        DList prev;
        public DList(String v){
            value = v;
        }
    }

    DList head , tail;
    HashMap<String, DList> map;
    public LRU( int capacity ){
        head = new DList();
        head.next = tail;
        tail.prev = head;
        map = new HashMap<>();
    }

    private addNode(String value){

    }

    private removeNode(String value){

    }

    private void moveToHead(DList node) {
        removeNode(node);
        addNode( node);
    })

    public String  get(String key ){
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
            addNode( new DList(value));
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




