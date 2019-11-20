import java.util.*;

class Calculator{
    public static void main(String [] args){
        System.out.println("Hello World");
    }

    public int calculate( String input ){
        if( input == null || input.length == 0 )
            return null;
        int o1= 1;
        Stack<Integer> st = new Stack<>();
        for ( int i =0 ;i< input.length() ; i++){
            
            if( Character.isDigit(c) ){
               // package a number together     
            }

            if( c == '+' || c== '-'){
                
            }

            if( c == '('){
                st.push(num);
            }
        }
    }
}