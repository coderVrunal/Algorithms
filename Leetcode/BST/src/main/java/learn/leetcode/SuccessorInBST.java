package learn.leetcode;

import java.util.Stack;

class SuccessorInBST {
    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        public TreeNode (int v){
            val = v;
        }
    }

    public TreeNode successorPractice( TreeNode root, TreeNode target){
        if( root == null )
            return null; 
        Stack<TreeNode> st = new Stack<TreeNode>();
        while( !st.isEmpty() || root != null ){
            while( root!= null){
                if( root == target){
                    if( root.right!= null )
                        return root.right;
                }
            }
        }
        return root;
    }
    public TreeNode successor( TreeNode root, TreeNode target){
        if( root == null )
            return null;
        // Successor is dependent on the right child of the node
        // If node contains right child, go right and then go as deep as possible on left
        // if node does not contain left. go up. Until you find a node with right child.

        // Algorithm
        // 1. Find the target node first
        // 2. Check if right child is present
        
        if( target.right != null ){
            target = target.right;
            while( target.left!= null )
                target =target.left;
            return target;
        }
        // 3. If not, go to top and get first element which has a right child.
        int inorder =  Integer.MIN_VALUE;
        Stack<TreeNode> st =  new Stack<TreeNode>();
        while( !st.isEmpty() || root != null ){
            while( root!= null ){ 
                st.push( root );
                root = root.left;
            }
            root = st.pop();
            if( inorder == target.val )
                return root;
            inorder = root.val; 
            root = root.right;
        }
        return root;
    }
}