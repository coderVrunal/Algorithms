package main.java.learn.leetcode;

import java.util.HashMap;
import java.util.Map.Entry;

/*
Design and implement a TwoSum class. It should support the following operations: add and find.

add - Add the number to an internal data structure.
find - Find if there exists any pair of numbers which sum is equal to the value.

Example 1:

add(1); add(3); add(5);
find(4) -> true
find(7) -> false
Example 2:

add(3); add(1); add(2);
find(3) -> true
find(6) -> false
*/

class TwoSumDS{
    // Online Two sum class.
    // Naive approach:
        // Sort the current state of the data structure and perform two pointer inward scan - O(NLogN)
    // To process online queries efficiently we can use hashSet <value> + linear scan for complement
        // But a hashset fails in finding two sums if input contians duplicates.
        // Hence use HashMap with <Val, integer>  
    ArrayList<Integer> list;
    HashSet<Integer> set;
    HashMap<Integer,Integer> map;
    public TwoSumDS(){
        list = new ArrayList<Integer>();
        set = new HashSet<Integer>();
        map = new HashMap<Integer, Integer>();
    }

    public void add(int x){
        list.add( x );
        set.put(x );
        map.put( x, map.getOrDefault(x, 0)+1);
    }
    public boolean find(int target){
        Arrays.sort( list );
        int left = 0, right = list.size();
        while( left < right){
            int sum = list.get(left) + list.get(right );
            if(  sum == target)
                return true;
            else if( sum < target )
            left++;
            else right--;
        }
        return false;
    }

    public boolean findSet(int target){
        // Failed
        for(  Integer keys : set){
            if( set.contains( target- keys));
                return true;
        }
        return false;
        
    }

    public boolean findMap(int target){
        for( Entry<Integer,Integer> keys : map.entrySet()){
            if( map.containsKey(target - keys.getKey()) ){
                int complement = target-keys.getKey();
                if( complement == keys.getKey() && map.get(complement) > 2 )
                    return true;
            }     
        }
        return false;
    }
}

