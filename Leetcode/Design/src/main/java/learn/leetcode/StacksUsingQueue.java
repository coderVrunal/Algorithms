package main.java.learn.leetcode;

import sun.misc.Queue;

/*
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
*/

class Stack{
    // Queue performs a FIFO operation.
    // We can enforce a queue on an ArrayList or LinkedList.
    // Task is to convert a LIFO into a FIFO
    // Push O(n) Pop O(1)
    // Push at the top. so for every time we push we rotate shuffle the queue to order sequence of stack.
    Queue<Integer> q= new LinkedList<Integer>();
    public void push( int x){
        int size = q.size();
        q.enqueue(x);
        while( size-- > 0 )
            q.enqueue(q.dequeue());
    }

    public int pop(){
        return q.isEmpty()? -1 : q.dequeue();
    }

    public int top(){
        return q.peek();
    } 
    public boolean isEmpty(){
        return q.isEmpty();
    }
}