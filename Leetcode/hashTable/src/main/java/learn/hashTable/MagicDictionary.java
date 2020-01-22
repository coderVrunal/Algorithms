/*
magic directory with buildDict, and search methods.

For the method buildDict, you'll be given a list of non-repetitive words to build a dictionary.

For the method search, you'll be given a word, and judge whether if you modify exactly one character into another character in this word, the modified word is in the dictionary you just built.

Example 1:
Input: buildDict(["hello", "leetcode"]), Output: Null
Input: search("hello"), Output: False
Input: search("hhllo"), Output: True
Input: search("hell"), Output: False
Input: search("leetcoded"), Output: False
*/

package learn.hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

class MagicDictionary {
    static HashMap<String, Integer>map;
    static HashSet<String> set;
    public static void main(String [] args){

    }

    public MagicDictionary(){
        map=new HashMap<String, Integer>();
        set = new HashSet<String>();
        
    }

    public static void buildDict( String [] words){
        // Build dict divides each input word by character and replaces with wild character *
        // the only issue, is that same word, eg hello --> will also return true result.
        // Hence we maintain a counter of word string 
        for( String word: words){
            set.add(word);
            for( int i=0 ; i< word.length() ; i++){
                String ss = word.substring(0,i) +"*"+word.substring(i+1,word.length());
                map.put( ss, map.getOrDefault(ss, 0)+1);
            }
        }
    }

    public static boolean search(String word){
        if( word == null )
            return false;

        for(int i =0 ; i< word.length(); i++){
            String ss = word.substring(0,i) + "*"+ word.substring(i+1,word.length());
            int c = map.getOrDefault(ss, 0);
            if( c >1 || c == 1 && !set.contains(word))
                return true;
        }
        return false;
    }
}