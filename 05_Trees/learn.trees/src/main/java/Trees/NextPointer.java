package Trees;
class NextPointer{
    class TreeNode{
        TreeNode left;
        TreeNode right;
        TreeNode next;
        int val;
        TreeNode(int v ){
            this.val = v;
        }
    }

    TreeNode prev, leftmost;

    public void processChild( TreeNode child ){
        if( child != null ){
            if(prev != null)
                prev.next = child;
            else{
                leftmost = child;
            }
            prev = child;

        }

    }
    public TreeNode nextAssignment( TreeNode root){
       
        if( root == null )
            return  root;
        
        leftmost = root;
        TreeNode curr = leftmost;
        while( leftmost != null ){
            prev = null;
            curr = leftmost;

            leftmost = null;

            while( curr != null ){
                processChild( curr.left);
                processChild( curr.right);
                curr = curr.next;
            }
        }
        return root;
    }
}