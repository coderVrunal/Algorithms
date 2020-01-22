package learn.leetcode;

import java.util.Random;
        /*
Given an array and a number k where k is smaller than size of array,
 we need to find the k’th smallest element in the given array.
 It is given that array elements are distinct.
Examples:

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 3
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}
k = 4
Output: 10*/

// Solution: 
        //Approach 1:  Sort and find 
        //Approach 2: Quick Select for kth smallest.
        //          Where I reduce the search space after pivot value partition
        //          Where all values less than pivot value is on left and values greater than pivot value is on right.
        
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

    private int quickSelect(int left, int right, int kSmallest) {
        if( left == right )
            return this.nums[left];
        Random rand = new Random();
        int pivot = left+ rand.nextInt(right-left);
        pivot = partition( left, right, pivot);

        if( kSmallest ==  pivot)
            return this.nums[pivot];

        else if( kSmallest < pivot )
            return quickSelect(left, pivot-1, kSmallest);
        else 
            return quickSelect(pivot+1, right, kSmallest);
    }

    private int partition(int left, int right, int pivot) {
        int pivot_element = this.nums[pivot];
        swap( pivot, right);
        int index = left;

        for( int i= left; i<=right ; i++){
            if( this.nums[i] < pivot_element){
               swap( index, i );
                index++;
            }
        }
        swap( index, right);
        return index;
    }

    private void swap(int index, int right) {
        int temp = this.nums[index];
        this.nums[index] = this.nums[right];
        this.nums[right] = temp;
    }
}