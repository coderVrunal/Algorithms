package learn.leetcode;

import java.util.ArrayList;
import java.util.List;

class PascalTriangle {
    public static void main(String [] args){
        
    }

    public ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> buildTriangle(int rows) {
        if( rows <= 0)
            return res;
        
        res.add(0, helper( rows , new ArrayList<>() ) );
        return res;
    }

    public ArrayList<Integer> helper( int rowNumber , ArrayList<Integer> list ){
        if( rowNumber == rowNumber+1){
            return list;
        }
        return list;

        
    }
}