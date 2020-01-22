/*
Given a sorted array nums, remove the duplicates in-place such that each 
element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the
 input array in-place with O(1) extra memory.

Example 1:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.

It doesn't matter what you leave beyond the returned length.

*/

class RemoveDuplicatesFromSortedArray{

    public int removeDups( int []nums){
        // given array remove dups.
        // Do it in place.
        // eg. [1,1,1,1,1] --> 1
        // eg [1,2,3,4,5] ->5
        //eg [1,1,2,2,3,3,4,4] -> 4

        // Brute force: Use auxillary array to store unique elements.
        //          Basically return HashSet as array.
        // O(1) space approach: Since we can swap all dup and return len of unique element arr.
        // Use two pointer approach. Where we traverse L->R keeping track of unique elements only.
        // When we encounter dups swap with R->L pointer and contract in pointer inwards.
        // Insight!!! Swapping does not help us to replace duplicate element wiht desired constraint
        // Use only one pointer which keeps track of unique element which increments only when invariant is true.
        int L = 1 ;
        for( int i=1; i< nums.length; i++){
            if( nums[i] != nums[i-1]){
                nums[L++]=nums[i];
            }
        }
        return L;
    }
}