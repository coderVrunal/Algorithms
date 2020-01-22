import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*

0 represents the obstacle can't be reached.
1 represents the ground can be walked through.
The place with number bigger than 1 represents a tree can be walked through, and this positive number represents the tree's height.
 

You are asked to cut off all the trees in this forest in the order of tree's height - always cut off the tree with lowest height first. And after cutting, the original place has the tree will become a grass (value 1).

You will start from the point (0, 0) and you should output the minimum steps you need to walk to cut off all the trees. If you can't cut off all the trees, output -1 in that situation.

You are guaranteed that no two trees have the same height and there is at least one tree needs to be cut off.

*/

class CuttOffTrees{
    public static void main (String [] args){

    }

    public static int cutTrees( List<List<Integer>> forest){
        List<int[]> trees = new ArrayList<int[]>();
        for( int i=0 ;i < forest.size(); i++){
            for( int j = 0; j< forest.get(i).size(); j++){
                int v = forest.get(i).get(j);
                if( v > 1 ){
                    trees.add(new int[]{v,i,j});
                }
            }
        }

        Collections.sort( trees, (a,b) -> Integer.compare(a[0]-b[0], 0));

        int ans = 0, sr =0 , sc=0;
        for( int [] tree: trees){
            int d = bfs(forest, 0,0,tree[1],tree[2] );
            if( d < 0 ) return -1;
            ans += d;
            sr = tree[1];
            sc = tree[2];
        }
        return ans;
    }


    public static int bfs( List<List<Integer>> forest , int sr, int sc, int destr, int destc){
        Queue<int[]> q = new LinkedList<int[]>();
        int [][]dirs =  new int[][]{ {-1,0},{0,1},{0,-1},{1,0} };
        int count=0;
        q.add( new int[]{sr,sc});
        while( !q.isEmpty() ){
            int [] point = q.poll();
            if( point[0] ==destr || point[1] ==destc)
                return count;
            for( int [] dir : dirs){
                int newR = point[0]+ dir[0];
                int newC = point[1] +dir[1];

                if( newR >=0 && newR < forest.size() && newC >=0
                 && newC <forest.get(0).size() && forest.get(newR).get(newC) > 1 ){
                     q.add( new int[] {newR, newC});
                 }
            }
            count++;
        }
        return -1;
    }
}