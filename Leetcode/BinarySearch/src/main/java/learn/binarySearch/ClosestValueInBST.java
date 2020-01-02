package learn.binarySearch;
import java.util.Stack;

class ClosestValueInBST {
    public static void main(String [] args){

    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int v){
            val = v;
            left = null;
            right = null;
        }
    }
    public static int closestValueBinarySearch( TreeNode root, double target){
        // Approach 2: Use binary serach across the BST
        // keep running minDifference and traverse halve serach space by traversing the BST
        // You can smartly split the search space by comparing left and right values
        int curr , closest = root.val;
        while( root != null ){
            curr = root.val;
            closest = Math.abs( target - curr ) < Math.abs( target-closest) ? curr :closest;
            root = root.val < target ?root.right : root.left; 
        }
        return closest;
    }

    public static int closestInorderSearch(TreeNode root, int target){
        Stack<TreeNode> st = new Stack<>();
        int pred = root.val;
        while( st.isEmpty() || root != null){
            while( root != null ){
                st.push( root);
                root =root.left;
            }
            root = st.pop();
            if( pred <  target && root.val > target){
                return Math.abs( root.val - target) < Math.abs(pred-target) ? root.val : pred;
            }
            pred = root.val;
            root = root.right;
        }
        return pred;
    }
}