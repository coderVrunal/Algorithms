package main.java.learn.leetcode;

import java.util.LinkedList;

/*
Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
*/

class QueueUsingStack{
    // Use two stacks back to back
    // Queue requires a FIFO operation
    // And Stack uses a LIFO
    //      Two stacks can resemble the behavior of queue
    //      First stack is offerStack. Once this stack gets full or you get a poll request.
    //      Dump data from offerStack into pollStack

    Stack<Integer> offerStack;
    Stack<Integer> pollStack;
    public QueueUsingStack(){
        offerStack = new LinkedList<Integer>();
        pollStack = new LinkedList<Integer>();
    }

    public void push(int x){
         offerStack.push( x );

    }

    public int pop(){
        if( pollStack.isEmpty() ){
            while( !offerStack.isEmpty() )
                pollStack.push( offerStack.poll() );
            return pollStack.pop();
        }
        else return pollStack.pop();
    }

    public int peek(){
        if(!pollStack.isEmpty() )
            return pollStack.peek();
        else{
            while( !offerStack.isEmpty() )
                pollStack.push( offerStack.poll() );
            return pollStack.peek();
        }
    }

    public boolean empty(){
        return pollStack.isEmpty() && offerStack.isEmpty();
    }
}

