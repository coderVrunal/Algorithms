package learn.leetcode;

// package main.java.learn.leetcode;
/*
Design a data structure that supports the following two operations:

void addWord(word)
bool search(word)
search(word) can search a 
literal word or a regular expression string containing only letters a-z or 
.. A . means it can represent any one letter.

addWord("bad")
addWord("dad")
addWord("mad")
search("pad") -> false
search("bad") -> true
search(".ad") -> true
search("b..") -> true
*/

class AddSearchWord{
    public static void main(String [] args){}

    class TrieNode {
        TrieNode [] links;
        boolean isEnd;
        public boolean containsKey(char c){
            return links[c-'a'] != null ;
        }

        public TrieNode get( char c){
            return links[c-'a'];
        }
        public void set( char c, TrieNode node){
            links[c-'a'] = node;
        }

        public void setEnd(){
            isEnd = true;
        }
        public boolean isEnd(){
            return isEnd;
        }
    }
    TrieNode root;
    public AddSearchWord(){
        root = new TrieNode();
    }

    public void addWord(String word){
        TrieNode node = root;
        for( char c : word.toCharArray() ){
            if(node.containsKey(c))
                node = node.get(c);
            else 
                node.set( c, new TrieNode());
        }
    }

    public TrieNode prefix(String word){
        TrieNode node = root;
        for( char c: word.toCharArray() ){
            if( !node.containsKey(c)) 
                return null;
            else node = node.get(c);
        }
        return node;
    }
    public boolean search(String word){
        TrieNode node = prefix( word );
        return node!= null && node.isEnd();
    }
}