package learn.leetcode;

class DeleteNode{
    public static void main(String []args){

    }

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode(int v){
            val = v;
        }
    }

    public TreeNode delete(TreeNode root, int val){
        // Subtask: find the node
        // delete node:
            // If node does not contain children
                // delete node
            // If node contains one child  
                // Swap with child.
                // Delete Node
            // If contains both child.
                // Find successor and and swap
                // Delete node

        // How to get successor?
        // Inorder traversal and use external data structure.
            // Next element can be found in O(1)
        // Controlled Recursion
        
        
    }
}