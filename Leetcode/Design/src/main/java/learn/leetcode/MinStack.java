package learn.leetcode;
/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 
*/

import java.util.Stack;

class MinStack {
    Stack<Integer> values;
    Stack<Integer> mins;
    /** initialize your data structure here. */
    public MinStack() {
        values = new Stack<Integer>();
        mins = new Stack<Integer>();
    }
    
    public void push(int x) {
        if( mins.isEmpty())
            mins.push(x);
        else if( !mins.isEmpty() && mins.peek() >= x){
            mins.push(x);
        }
        values.push(x);
    }
    
    public void pop() {
        if( !values.isEmpty()  ){
            int val = values.pop();
            if( !mins.isEmpty()  && val == mins.peek() ){
                mins.pop();
            }
        }
    }
    
    public int top() {
        return values.isEmpty() ? -1 : values.peek();
    }
    
    public int getMin() {
        return mins.isEmpty() ? -1 : mins.peek() ;
    }
}