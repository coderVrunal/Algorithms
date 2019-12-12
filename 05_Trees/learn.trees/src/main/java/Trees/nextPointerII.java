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



}