package Trees;

import java.util.*;

class nextPointerII{
    class TreeNode{
        TreeNode next;
        TreeNode left;
        TreeNode right;
        int val; 
        TreeNode( int v ){
            this.val = v;
        }
    }
// BFS alone would not work as we are dependent on the parents assign a next pointer in adjacent branch
// Since when we go deeper we no longer have access to parents.
// But we can consider each level as a list and the leftmost pointer as the head of the list.
    public TreeNode buildTree( TreeNode root){
        if( root == null )
            return root;

        TreeNode leftmost = root;
        while( leftmost != null ){
            TreeNode head = leftmost;
            while( head!= null ){
                if( head.left != null )
                    head.left.next = head.right;
                
                head.right.next = head.next.left;
                head = head.next;
            }
        }
        return root;
    }

    public TreeNode practiceNextPointer( TreeNode root){
        if( root == null )
            return root;

        TreeNode leftMost = root;
        while( leftMost != null ){
            TreeNode head = leftMost;
            while( head != null ){
                if( head.left != null ){
                    head.left.next  = head.right;
                }
                head.right.next = head.next.left;
                head = head.next;
            }
        }
        return root;
    }

    public TreeNode BFS( TreeNode root){
        if(root == null )
            return root;

        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.offer( root );
        while( !q.isEmpty() ){
            int size = q.size();
            for( int i =0 ; i< size ; i++){
                TreeNode node = q.poll();
                if( i < size-1){
                    node.next = q.peek();
                }
                if( node.left!= null)
                    q.offer(node.left);
                if( node.right != null )
                    q.offer( node.right);
            }
            
        }
        return root;
    }
}