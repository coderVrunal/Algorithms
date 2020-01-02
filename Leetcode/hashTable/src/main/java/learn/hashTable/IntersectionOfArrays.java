package learn.hashTable;

import java.util.ArrayList;
import java.util.HashMap;

class IntersectionOfArrays{
    public static void main(String [] args){

    }

    public static ArrayList<Integer> intersect( int [] nums1, int[] nums2){
        if( nums1 == null || nums2 == null)
        return null;
        HashMap<Integer, Integer> map  = new HashMap<>();
        for( int i : nums1 ){
            map.put( i, map.getOrDefault(i, 0)+1 );
        }
        ArrayList<Integer> res = new ArrayList<>();
        for( int i: nums2){
            if( map.containsKey(i)){
                if( map.get(i) > 0){
                    map.put(i , map.get(i)-1);
                    res.add( i );
                }
                if(map.get( i) == 0)
                    map.remove(i);
            }
        }
        return res;
    }
}