package learn.leetcode;

class Trie{

    class TrieNode{
        TrieNode [] links;
        // HashMap<Character , char[] links>
        char c;
        private boolean isEnd;

        public TrieNode(){
            links = new TrieNode[26];
        }

        public boolean containsKey( char c){
            return links[c-'a'] != null;
        }
        public TrieNode get(char c){
            return links[c-'a'];
        }

        public void put( char ch , TrieNode node){
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
    public Trie(){
        root = new TrieNode();
    }
    public void insert( String s){
        TrieNode node = root;
        for( char c : s.toCharArray() ){
            if( !node.containsKey(c))
                node.put( c , new TrieNode());
            node = node.get( c );
        }
        node.setEnd();
    }
    public boolean startsWith(String s){
        TrieNode node = prefix(s);
        return node!= null;
    }

    public TrieNode prefix(String s){
        TrieNode node = root;
        for( int i=0 ; i< s.length() ; i++){
            char c = s.charAt(i);
            if( node.containsKey(c))
                node = node.get(c);
            else
             return null; 
        }
        return node;
    }
    public boolean search( String s){
        TrieNode node = prefix(s);
        return node!= null && node.isEnd();
    }
}