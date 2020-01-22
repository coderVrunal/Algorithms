package learn.leetcode;
/* 
Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.

Example:

MovingAverage m = new MovingAverage(3);
m.next(1) = 1
m.next(10) = (1 + 10) / 2
m.next(3) = (1 + 10 + 3) / 3
m.next(5) = (10 + 3 + 5) / 3
*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class MovingAverage {
    public static void main(String [] args){
        MovingAverage m = new MovingAverage(3);
        System.out.println( m.next(1));
        System.out.println( m.next(10));
        System.out.println( m.next(3));
        System.out.println( m.next(5));
    }
    Queue<Integer> q;
    int size;
    int sum;
    public MovingAverage( int size){
        q= new LinkedList<Integer>();
        this.size = size;
        sum = 0;
    }

    public int next( int val){
        sum+=val;
        q.offer(val);
        if( q.size() > size){
            sum = sum- q.poll();
        }
        return sum/q.size();
    }
}

