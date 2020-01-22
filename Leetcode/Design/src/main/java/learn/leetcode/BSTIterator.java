package learn.leetcode;
/*
Implement an iterator over a binary search tree (BST). 
Your iterator will be initialized with the root node of a BST.

Calling next() will return the next smallest number in the BST.

*/

import java.util.Stack;

class BSTIterator {
    // Store the state of inorder traversal of BST in an ArrayList and query next and hasNext operations on that ArrayList. 
    // Every push operation could be O(N) complexity.
    //  Push operation S:(N) O(NLogN)
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode( int v ){
            val = v;
        }
    }
    Stack<TreeNode> st ;

    public BSTIterator(TreeNode root) {
        st = new Stack<TreeNode>();
    }

    public int _leftInOrder( TreeNode root ){
        while( root != null ){
            st.push( root);
            root = root.left;
        }
        
    }
    
    /** @return the next smallest number */
    public int next() {
        TreeNode node = st.pop();
        if( node != null )
            _leftInOrder(node.right);
        return node.val;
    }
    
    /** @return whether we have a next smallest number */

    public boolean hasNext() {
        return st.size() >0;
    }
}