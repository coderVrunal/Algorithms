package karumachi.stacks;

import java.util.Stack;

class ValidateParanthesis {
    public static void main(String[] args) {
        
    }

    // Constraints
        /*
            If any other ascii character.
            input = String
            output = boolean
        */
    // Ideas
        /*
            Stack maintains the sequence in reverse for the expected closing brackets
            for every open store the corresponding closing
            if value inconsitent in stack return false
            if stack is empty after all traversal output successful
        */
    // TestCases
    public static boolean validate( String input){
        // Check null
        if( input == null || input.length() ==0 ){
            return true;
        }

        Stack<Character> st = new Stack<>();
        for( int i =0 ; i< input.length() ; i++){
            char c  = input.charAt(i);
            if( c == '('){
                st.push( ')');
            }
            else if( c == '{'){
                st.push('}');
            }
            else if( c == '['){
                st.push( ']');
            }
            else{
                if( st.isEmpty() || c != st.pop() ){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}

