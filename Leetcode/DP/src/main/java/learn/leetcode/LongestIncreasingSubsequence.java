package learn.leetcode;

import java.util.Arrays;

class LongestIncreasingSubsequence {
    public static void main(String [] args){

        System.out.println( lengthLIS(new int[] {10,2,3,6,4,101,18}));
    }

    public static int lengthLIS( int [] nums){
        if( nums == null|| nums.length == 0)
            return 0;
        int n = nums.length;
        int [][] memo = new int [n+1][n];
        for( int [] l : memo){
            Arrays.fill( l, -1);
        }
        return  LISMemoized(nums, -1, 0, memo);
        
        // return LIS( nums, Integer.MIN_VALUE , 0 );
    }

    public static int LIS( int [] nums, int prev, int traversed ){
        // 2^n time complexity.
        //  Recursion size 
        if( traversed == nums.length )
            return 0;   
        int taken = 0;
        if( nums[traversed] > prev){
            taken = 1+ LIS(nums, nums[traversed], traversed+1 );
        }

        int notTaken = LIS( nums, nums[traversed] , traversed+1);
        return Math.max( taken, notTaken);
    }

    public static int LISMemoized( int [] nums, int prevIndex, int traversed, int [][]memo){
        // We store intermediate states of for every prev index in 2D memo.
        // where memo[i][j=0...n] represents the result of LIS for ith iteration
        // 
        if( traversed == nums.length )
        return 0;
        
        if( memo[prevIndex+1][traversed] >= 0)
        return memo[prevIndex+1][traversed];

        int taken = 0;
        if( prevIndex <0 || nums[prevIndex] < nums[traversed] ){
            taken = 1+ LISMemoized( nums, traversed, traversed+1, memo);
        }

        int notTaken = LISMemoized(nums, prevIndex, traversed+1, memo);
        memo[prevIndex+1][traversed] = Math.max( taken, notTaken);
        return memo[prevIndex+1][traversed];
    }
}