package learn.binarySearch;

/* Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the
numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.
Example 1:

Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.
 

Example 2:

Input: 
nums = [1, 2, 3]
Output: -1
Explanation: 
There is no index that satisfies the conditions in the problem statement.
*/

class PivotIndex{
    public static void main(String [] args){
        System.out.println( findPivotPrefixSum(new int[]{1, 7, 3, 6, 5, 6}));
    }
    public static int  findPivotExpandCenter(int [] nums){
        // Sum of (left) == Sum of(right)
        // Expand around center and compute sum of Left and Right side. O(n^2)
        for( int i= 0 ; i < nums.length ; i++){
            if( expandCenter( nums , i ))
                return i;
        }
        return -1;
    }

    public static boolean expandCenter( int [] nums, int center){
        int sumL =0, sumR = 0;
        int left = center-1, right = center+1;
        while( left>=0 ){
            sumL += nums[left--];
        }
        while( right < nums.length){
            sumR += nums[right++];
        }
        return sumL == sumR;
    }

    public static int findPivotPrefixSum(int []nums){
        // How can we optimize the O(n) search around every iteration?
        //  precompute suffix sum
        //      

        int [] suffixSum = new int [nums.length];
        suffixSum[nums.length-1] = nums[nums.length-1];
        for( int i=nums.length-2; i>=0; i--){
            suffixSum[i] =suffixSum[i+1] + nums[i];
        } 
        int sum = 0;
        for( int i=0 ; i< nums.length; i++){
            if( sum+nums[i] == suffixSum[i])
                return i;  
            sum+= nums[i];
        }
        return -1;
    }
}