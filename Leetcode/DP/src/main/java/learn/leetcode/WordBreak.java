package learn.leetcode;

import java.util.HashSet;
import java.util.List;

class WordBreak {
    /*
    Given a non-empty string s and a dictionary wordDict containing a list of non-empty words, 
    determine if s can be segmented into a space-separated sequence of one or more dictionary words.
    Note:

    The same word in the dictionary may be reused multiple times in the segmentation.
    You may assume the dictionary does not contain duplicate words.
    Example 1:

    Input: s = "leetcode", wordDict = ["leet", "code"]
    Output: true
    Explanation: Return true because "leetcode" can be segmented as "leet code".
    Input: s = "applepenapple", wordDict = ["apple", "pen"]
    Output: true
    Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
                Note that you are allowed to reuse a dictionary word.

    Input: s = "catsandog", wordDict = ["cats", "dog", "sand", "and", "cat"]
    Output: false

*/
    public boolean wordBreak( String s, List<String> wordDict ){
        // Approach 1: For 0..i...n find an iteration which perfectly partitions the string into two words such that 
//               these words are in the dictionary. - Fails when you have more than two words.
//      Approach 2: Recursive parition. 0...i...n. Find ith iteration such that 0,i is a word and feed smaller subproblem
//          recursively until all characters contribute to words- O(n^n)
//          

        HashSet<String> set = new HashSet<>();
        for( String str : wordDict)
            set.add( str );
        for(int i =0 ; i< s.length() ; i++){
            if(set.contains(s.substring(0,i)) && set.contains(s.substring(i+1, s.length()-1)))
                return true;
        }
        return false;
    }

    public boolean wordBreakRecursive( String s, List<String> wordDict){
        // Approach 2: Recursive parition. 0...i...n. Find ith iteration such that 0,i is a word and feed smaller subproblem
        //          recursively until all characters contribute to words- O(n^n) - Time limit exceeded
        return wordParition( s, 0, new HashSet<String>(wordDict) );
        
    }

    public boolean wordParition( String s, int start, HashSet<String> set){

        if( start == s.length() )
            return true;

        for( int i =start+1 ; i<= s.length() ; i++){
            if( set.contains(s.substring(start, i)) && wordParition(s, i, set ));
            return true;
        }
        return false;
    }

    public boolean wordBreakMemo( String s, List<String> wordDict ){
        return wordPartitionMemo( s , 0 , new HashSet<String> (wordDict), new  Boolean[s.length()]);
    }

    boolean wordPartitionMemo(String s, int start, HashSet<String> set, Boolean[] memo){
        if( start == s.length() )
            return true;
        if( memo[start] != null )
        return memo[start];

        for( int i = start+1; i <= s.length() ; i++){
            if( set.contains(s.substring(start,i)) && wordPartitionMemo(s, i, set, memo))
                return memo[i] = true; 
        }
        return memo[start] = false;
    }
}