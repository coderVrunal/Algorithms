package main.java.learn.leetcode;

import sun.awt.HeadlessToolkit;

/*
Design and implement a data structure for Least Recently Used (LRU) cache. 
implement following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
it should invalidate the least recently used item before inserting a new item.

The cache is initialized with a positive capacity.
both operations in O(1) time complexity?
*/

class LRU{

    HashMap<Integer,DList> cache;
    DList head;
    DList tail;
    int size;
    class DList{
        int val;
        int key;
        DList next;
        DList prev;
        public DList(int k,int v){
            this.key = k; this.val = v;
        }
    }
    public LRU(int capacity){
        cache = new HashMap<Integer,DList>();
        head = new DList(-1,-1);
        tail = new DList(-1,-1);
        head.next = tail;
        tail.prev = head;
        size = capacity;
    }

    public int get( int key){
        
        if( cache.containsKey(key) ){
            moveToHead(cache.get(key));
            return cache.get(key).val;
        }
        return -1;
    }

    public  void put( int key, int val){
        if( cache.containsKey(key) ){
            DList node = cache.get(key);
            node.val = val;
            cache.put( key, node);
            moveToHead(node);
        }
        else {
            DList node = new DList(key, val);
            addNode( node );
            cache.put( key, node);

            if( cache.size() == size ){
                // pop from tail
                DList tailElement = popTail();
                cache.remove( tailElement.key );
            }
        }
    }


    public void addNode( DList node){
        node.prev = head;
        node.next = head.next;

        head.next.prev = node;
        head.next = node;

    }

    public void moveToHead(DList node){
        removeNode( node );
        addNode( node);
    }

    private void removeNode(DList node){
        DList prev= node.prev;
        DList next= node.next;

        next.prev = prev;
        prev.next = next;
    }

    public DList popTail(){
        DList node = tail.prev;
        removeNode(node);
        return node;
    }

    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */