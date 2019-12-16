package learn.binarySearch;
class SearchInRotatedArray{
    public static void main(String [] args){
        System.out.println( search(new int[] {4,5,6,7,1,2,3}, 3));
    }

    // Given input is sorted, although rotated.
    // Given a target, find the index or return -1;
    public static int search( int []nums, int k){
        // check null;
        if( nums == null || nums.length == 0)
            return -1;

        int left= 0, right =nums.length-1;
        int mid;
        while( left <= right ){ //accessing only single index and no post processing
            mid = left + (right-left)/2;
            if( nums[mid] == k)
                return mid;
            else if( nums[left] <= nums[mid] ){//check if your search space contains not rotate pivots
                if( nums[left] <= k && nums[mid] > k)
                    right = mid-1;    
                else 
                    left = mid+1;
            } 
            else{ //your search space contains a rotating pivot
                if( nums[right] >= k && nums[mid] < k)
                    left = mid+1;   
                else  
                    right = mid-1;    
            }    
        }  
        return -1;

    }
}