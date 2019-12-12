package learn.leetcode;

import java.util.Stack;

class ValidateBST {

    class TreeNode {
        int val;
        TreeNode right;
        TreeNode left;
        public TreeNode (int v){
            val = v;
        }
    }

    /*
    ideas: 
        1. Traverse the bst recursively and validate if  root.left.val < root.val < root.right.val
        2. Traverse the BST iteratively
        3. traverse inorder and validate if sorted or not.
    */

    public boolean validate(TreeNode root ){
        if( root == null )
            return false;
        return traverse( root , null, null);
    }

    public boolean traverse( TreeNode root , Integer lowest, Integer highest ){
        if( root== null )
            return true;
        
        int value = root.val;
        if( lowest != null &&  value <= lowest) return false;
        if( highest != null &&  value >= highest) return false;

        if( ! traverse(root.left , lowest,  value)) return false;
        if( ! traverse(root.right , value, highest)) return false;
        return true;
    }


    
    Stack<TreeNode> st = new Stack<>();
    Stack<Integer> lowers = new Stack<>();
    Stack<Integer> uppers = new Stack<>();


    public void update( TreeNode root, Integer lowest, Integer highest){
        if( root == null )
            return;
        st.push(root);
        lowers.push(lowest); 
        uppers.push(highest);
    }
    public boolean validateIterative( TreeNode root){
        if( root == null )
            return true;

        Integer lower = null , upper = null;
        update( root, lower, upper);

        while( !st.isEmpty() ){
            root = st.pop();
            lower = lowers.pop();
            upper = uppers.pop();

            if( root != null ){
                if( lower != null && root.val < lower)
                    return false;
                if( upper != null && root.val > upper)
                    return false;
                update( root.left, lower, root.val);
                update(root.right, root.val, upper);
            }
            // return true;
        }
        return true;
    }


    public boolean validateInorder( TreeNode root){
        if( root == null )
            return true;

        Stack<TreeNode> st = new Stack<>();
        int inorder = Integer.MAX_VALUE;
        while( !st.isEmpty() || root != null ){
            while( root != null ){
                st.push( root );
                root = root.left;
            }
            root = st.pop();
            if( root.val < inorder)
                return  false;
            inorder = root.val;
            root =root.right;
        }
        return true;

    }
}