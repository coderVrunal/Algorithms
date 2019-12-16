package learn.binarySearch;
class SearchRange{
    public static void main(String [] args){

    }

    /*
    Input: nums = [5,7,7,8,8,10], target = 8
    Output: [3,4]
    */
    public static int [] searchRange( int [] nums , int target){
        if( nums == null || nums.length == 0)
            return new int []{-1,-1};

        int left =0, right = nums.length-1;
        int mid;
        while( left < right){
            mid = (left+right)/2;
  
        }
    }
}