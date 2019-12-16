package learn.leetcode;

import java.util.HashMap;

class ClimbStairs {
    public static void main(String [] args){
        System.out.println(climbStairsRecursive(8));
        System.out.println( climbStairsMemeoizationHelper(8, 0) ) ;
        System.out.println( climbStairsDP(8));
    }

    public static int climbStairsRecursive( int n){
        // This Recursive function will build from bottom up
        
        return climbStairsRecursiveHelper( n , 0);
    }

    public static int climbStairsRecursiveHelper( int n, int index){
        // Number of steps to reach 1 , 2 , 3 .....
        // the base conditions to stop is if index is above n
        // And if index == n

        if( index > n )
        return 0;
        if( index == n )
            return 1;
        return climbStairsRecursiveHelper( n , index+1) + climbStairsRecursiveHelper(n,index+2);
    }


    static HashMap<Integer, Integer> cache = new HashMap<>();

    public static int climbStairsMemoization( int n){
       return climbStairsMemeoizationHelper(n, 0);
    }

    public static int climbStairsMemeoizationHelper( int n , int index){
        if( index > n )
            return 0;
        if( index == n)
            return 1;
        if( cache.containsKey(index) ) 
        return cache.get(index);

        cache.put( index, climbStairsMemeoizationHelper(n, index+1) + climbStairsMemeoizationHelper(n, index+2));
        return cache.get(index);
    }

    public static int climbStairsDP(int n ){
        int [] dp =new int [n+1];
        dp[1] = 1;
        dp[2] =2;

        for( int i=3 ; i<= n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

