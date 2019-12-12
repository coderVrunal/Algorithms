package Trees;

class MaxDepthOfTree{

     
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int v ){
            this.val = v;
        }

    public int maxDepth(TreeNode root ){
        if( root == null )
            return root.val;
            
        int left  = maxDepth(root.left);
        int right = maxDepth(root.right);
        int val =  Math.max( left, right);
        return val;

    }
}
}