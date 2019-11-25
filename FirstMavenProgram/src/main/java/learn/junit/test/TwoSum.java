package learn.junit.test;

import java.util.HashMap;

public class TwoSum{
    public int[] twoSum( int [] arr, int target){
        if( arr == null || arr.length ==0){
            return new int []{};
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i =0; i< arr.length ; i++){
            if( map.containsKey(target - arr[i] ) ){
                return ( new int  [] {map.get(target - arr[i])  , i}  );
            }
            else{
                map.put( arr[i] , i );
            }
        } 
        return new int[]{};

    }
}