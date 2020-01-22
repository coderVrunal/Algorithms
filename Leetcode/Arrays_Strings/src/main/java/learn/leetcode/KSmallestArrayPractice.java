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



class KSmallestArrayPractice{
    public static void main(String [] args){

    }
    int [] nums;
    public int kSmallest( int [] nums , int k){
        if( nums == null|| nums.length ==0 )
            return 0;
        this.nums = nums;
        int size= nums.length;
        return quickSelect( 0, size, size-k);

    }

    public int quickSelect( int left, int right, int kSmallest){
        Random rand =new Random();
        int pivot = left + rand.nextInt(left+1);
        pivot = partition( left,right, pivot);
        if( pivot == kSmallest)
            return nums[pivot];
        else if( pivot <  kSmallest)
            return quickSelect(pivot+1, right, kSmallest);
        else 
            return quickSelect(left, pivot-1, kSmallest);
    }

    private int partition(int left, int right, int pivot) {
         int pivotVal = nums[pivot];
        //  Move pivot to last
         swap( pivot, right);
         int index = left;
         for( int i=left; i<right ; i++){
             if( nums[i] < pivotVal){
                swap( index, i );
                index++;
            }
         }

         swap(index, right);
         return index;
    }

    private void swap(int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}