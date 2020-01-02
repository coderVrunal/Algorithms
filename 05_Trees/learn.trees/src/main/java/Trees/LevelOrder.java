package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class LevelOrder{
    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        TreeNode(int v ){
            this.val = v;
        }
    }
  
    public List<List<Integer>> levelOrderPractice( TreeNode root){
        List<List<Integer>> res = new ArrayList<>();
        if( root == null )
            return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add( root );
        while(!q.isEmpty() ){
            List<Integer> temp = new ArrayList<Integer>();
            int size = q.size();
            for( int i = 0 ; i <size ; i++){
                TreeNode node = q.poll();
                temp.add( node.val );
                if( node.left!= null )
                    q.add( node.left);
                if( node.right != null )
                    q.add( node.right);
            }
            res.add( temp );
        }
        return res;
    }
    public List<List<Integer>> levelOrder( TreeNode root){
        if( root == null )
        return null;

        // Level order best represented by BFS.
        // We traverse all nodes in levels .. 1...h

        Queue<TreeNode> q= new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        q.add( root );
        while( !q.isEmpty()) {
            
            int size = q.size() ;
            ArrayList<Integer> temp = new ArrayList<>();
            for( int i = 0 ;i < size ; i++){    
            TreeNode node = q.poll();
            temp.add( node.val );
            if( node.left != null )
                q.add( node.left);
            
            if( node.right != null )
                q.add( node.right);
            }
            res.add( temp );
        }
        return res;
    } 
}