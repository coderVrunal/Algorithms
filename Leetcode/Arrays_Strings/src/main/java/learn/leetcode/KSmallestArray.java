package main.java.learn.leetcode;

import java.util.Random;
class KSmallestArray{
    int [] nums;
    public static void main( String [] args){

    }

    public int kSmallQuickSelect(int[] nums, int k){
        // Quickselect, choose a pivot element such that:
        // All values less than pivot is on left and 
        // All values more than pivot is on right;
        // This is the basis for quicksort
        // With quickselect we reduce the search space by logn evertime 
        // as we converge towards value kth Smallest


        // Algorithm:
        // 1. Pick pivot
        // 2. rearrange numbers around pivot
        // 3. Compare and kth smallest ie. N-k value with pivot and recurse to smaller search space.
        if( nums == null || nums.length < k )
            return 0;
        this.nums = nums;
        int size = nums.length;
        return quickSelect( 0, size-1, size-k );



        
        
    }
}