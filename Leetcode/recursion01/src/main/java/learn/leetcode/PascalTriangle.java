package main.java.learn.leetcode;


class PascalTriangle{
    public static void main(String [] args){
        
    }

    ArrayList<ArrayList<Integer>>res = new ArrayList<>();
    public List<List<Integer>> buildTriangle( int rows){
        if( rows <= 0)
            return res;
        
        res.add(0, helper( rows , new ArrayList<>() ) );
    }

    public ListNode<Integer> helper( int rowNumber , ArrayList<Integer> list ){
        if( rowNumber == rowNumber+1){
            return list;
        }

        
    }
}