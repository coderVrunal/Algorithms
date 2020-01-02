package learn.leetcode;
/*
Input: root = [3,1,4,null,2], k = 1
   3
  / \
 1   4
  \
   2
Output: 1
*/

import java.util.Stack;

class KSmallestBST {
    public static void main(String args[]){
        System.out.println("Hello World");
    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode( int v){
            val = v;
        }
    }

    public int kSmall( TreeNode root, int k){
        // Ideas:
        // 1. Perform Inorder traversal, get kth smallest and return result. O(NLogN)
        //      1.a Store entire traversal in buffer array Space: O(N) 
        //      1.b Maintain a counter k
        Stack<TreeNode> st = new Stack<TreeNode>();
        while( !st.isEmpty() || root!= null ){
            while( root!= null ){
                st.push(root);
                root =root.left;
            }

            root = st.pop();
            k--;
            if( k == 0)
                return root.val;
            root = root.right;
        }
        return root != null ? root.val:0;
        
    }
}