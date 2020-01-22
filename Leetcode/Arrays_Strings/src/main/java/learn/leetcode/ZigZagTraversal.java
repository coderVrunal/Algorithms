import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
Given a binary tree, return the zigzag level order traversal of its nodes' values.
(ie, from left to right, then right to left for the next level and alternate between).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
*/

class Solution{
    public static void main(String [] args){

    }
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }

    public static List<List<Integer>> ZigZag(TreeNode root ){
        List<List<Integer>> res = new ArrayList<>();
        if( root == null )
            return res;
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer( root );
        boolean LToR = true;
        while(!q.isEmpty() ){
            int size = q.size();
            LinkedList<Integer> temp =new LinkedList<>();

            if( LToR){
                for( int i= 0; i< q.size() ; i++){
                    temp.add( q.poll().val);
                }
            }
            else{
                for( int i= 0; i< q.size() ; i++){
                    temp.addFirst( q.poll().val);
                }
            }
            res.add( temp);
            
        }
    }
}
