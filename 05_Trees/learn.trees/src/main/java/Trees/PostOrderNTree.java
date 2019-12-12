package Trees;

import java.util.LinkedList;
import java.util.List;

class PostOrderNTree{

    class TreeNode{
        int val;
        TreeNode [] child;
        TreeNode( int v){
            this.val = v;
            this.child = null;
        }
    }


    public List<Integer> postOrder( TreeNode root){
        if( root == null )
            return null;

        LinkedList<Integer> res = new LinkedList<>();
        LinkedList<TreeNode> list = new LinkedList<>();

        list.add( root);

        while( !list.isEmpty()){
            TreeNode node = list.pollLast();
            res.addFirst( node.val );

            for( TreeNode children : node.child){
                list.add( children );
            }
        }

        return res;
    }

}