package learn.leetcode;

class PrintArray{

    public static void main(String [] args){
        printer( "helloworld", 0);
    }

    public static void printer( String input, int index){
        if( index == input.length())
            return;

        printer(input, index+1);
        System.out.print( input.charAt(index));
    }
}