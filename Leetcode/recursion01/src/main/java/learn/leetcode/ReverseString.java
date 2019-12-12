package learn.leetcode;

class ReverseString{
    public static void main(String [] args){
        char [] input = {'h','e','l','l','o'};
        char [] output = reverse( input );
        for( char c: output)
            System.out.print( c );
    }

    public static char[] reverse( char [] input){
        if( input == null )
            return input;
        helper( input , 0 , input.length-1 );
        return input;
    }

    public static void helper( char[] input, int left, int right){
        if(left >= right )
            return;
        char temp  = input[left];
        input [left++] = input[right];
        input[right--] = temp;
        helper( input, left, right);
    }   
}