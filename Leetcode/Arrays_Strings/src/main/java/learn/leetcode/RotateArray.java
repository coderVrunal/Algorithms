/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

*/


class Solution{
    public void rotate(int[] nums, int k) {
        // Brute force: Use an auxillary with array arrCpy function starting from k.
        // O(1) inplace: rotate inplace. 
        //eg:  [1,2,3,4,5] k=2 --> [4,5,1,2,3]
        // Issue: Shifting element is an O(n) operation. Hence moving element for k steps would O(KN)complexity
        // Rotate. [5,4,3,2,1]
                    // [4,5,1,2,3]

        if( nums == null|| nums.length ==0|| k ==0 ){
            return ;
        }
        int n = nums.length-1;
        k = k%(n+1);

        rotate(nums, 0, n);
        rotate(nums, 0, k-1);
        rotate(nums, k, n);
        // return nums;
    }

    public void rotate( int [] nums, int left, int right){
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;right--;
        }
    }
}