package learn.leetcode;
import java.util.HashMap;

/*
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*/

class TwoSum{
    public static void main(String [] args){

    }

    public static int [] twoSum(int [] nums, int target){
        //Problem: Return indices of two number that sum to target
        // Constraints on input? -> -ve?, empty?, duplicates?
        // Can result contain duplicate? 
            // eg: [4,4] target =8
            // eg: [4] target = 8 --failed!
        // What to return if no solution?

        // Approach: Sort and two pointers.? -> Would fail as we need to return indices
        // Approach2: Use hashmap <value,Index> While iterating L->R search in the array if a complement of target is present in hashmap.
        // This would tell us, if we have an on left of i which can sum with nums[i] to make target.
        // O(n) result.
        // Works for duplicates as well
        if( nums == null ||nums.length < 1 ){
            return nums;
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for( int i=0; i< nums.length ;i++){
            if ( map.containsKey(target- nums[i])){
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put( nums[i], i);
        }

        return new int []{-1};
     }
}