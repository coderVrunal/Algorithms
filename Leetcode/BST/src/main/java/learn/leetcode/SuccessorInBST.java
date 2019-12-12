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

    public TreeNode successor( TreeNode root, TreeNode target){
        if( root == null )
            return null;

        Stack<TreeNode> st =  new Stack<>();
        while( !st.isEmpty() || root != null ){
            while( root!= null ){
                if( root == target){
                    if( root.right != null )
                     return root.right;
                    else if(!st.isEmpty()) 
                         return st.pop();
                    else return null;
                    }    
                st.push( root );
                root = root.left;
            }
            root = st.pop();
            if( root == target){
                if( root.right != null )
                 return root.right;
                else if(!st.isEmpty()) 
                     return st.pop();
                else return null;
                }   
            root = root.right;
        }
        return root;
    }
}