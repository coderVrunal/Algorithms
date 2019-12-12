package Trees;

import java.util.LinkedList;
import java.util.List;

class PostOrder{
    
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int v ){
            this.val = v;
        }
    }


    public List<Integer> postOrder(TreeNode root){
        if( root== null )
            return null;

        /*
        We need to access L - > R - > C
        To go from L --> R we have to go through C
        And then again print C
        So, if we see this, we can store result of C backwards. ie Keep adding values in front.
        Use a linked list 
        */

        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        LinkedList<Integer> res = new LinkedList<>();

        list.add( root);

        while( !list.isEmpty() ){
            TreeNode node =  list.pollLast();
            res.addFirst( node.val );
            
            if( node.left != null )
                list.add( node.left);
            if( node.right != null )
                list.add( node.right);
        }
        return res;
    }
}