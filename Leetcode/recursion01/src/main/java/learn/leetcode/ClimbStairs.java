package main.java.learn.leetcode;


class ClimbStairs{
    public static void main(String [] args){

    }

    static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();
    public static climb( int input){
        if( cache.contains(input))
        return cache.get( input );
        int result ;
        if( input == 1 )
        result = input;
        else if( input==2 )
        result = input;
        else 
        result = climb(input);

        cache.put( input ,result);
        return result;
    }
}

