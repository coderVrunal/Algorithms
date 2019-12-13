package learn.leetcode;

import java.util.HashMap;

class FibonacciMemoization {
    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static void main(String[] args) {

    }

    public static int fib(int n) {
        if (cache.containsKey(n))
            return cache.get( n );
        int result;
        if (n < 2)
            result = n;
        else{
        result = fib( n-1)+ fib(n-2);
        }
        cache.put( n, result);
        return result;
        
    }
}