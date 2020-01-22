package learn.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Codec{

    class TreeNode{
        TreeNode left;
        TreeNode right;
        int val;
        public TreeNode (final int v){
            val = v;
        }
    }

    public String serialHelper(TreeNode root , StringBuffer sb){
        if( root == null )
            sb.append("null,");
        else {
            sb.append( String.valueOf(root.val ) +",");
            sb.append( serialHelper(root.left, sb));
            sb.append( serialHelper(root.right, sb));

        }
        return sb.toString();
    }
    public String serialize( TreeNode root){
        final StringBuffer sb = new StringBuffer();
        return serialHelper( root, sb);
    }

    public TreeNode deserialize(String data){
        String [] dataSplit = data.split(",");
        List<String> res = new LinkedList<String> (Arrays.asList(dataSplit));
        return deserializeHelper(res);
    }

    public TreeNode deserializeHelper( List<String> res ){

        if( res.get(0).equals("null")){
            res.remove(0);
            return null;
        }
        else {
            TreeNode root = new TreeNode( Integer.valueOf(res.get(0)));
            res.remove(0);
            root.left = deserializeHelper(res);
            root.right = deserializeHelper(res);
            return root;
        }
    
    }

}