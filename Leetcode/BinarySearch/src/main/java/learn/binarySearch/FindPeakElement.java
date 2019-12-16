package learn.binarySearch;

class FindPeakElement{
    public static void main(String []  args){
        System.out.println( peak( new int [] {4,5,6,7,1,2,3}) );
    }

    public static int peak(int [] nums){
        if( nums == null || nums.length == 0 )
            return -1;

        int left = 0, right =nums.length-1;
        int mid ;
        while( left < right ){
            mid = (left + right)/2;
            if( nums[mid] > nums[mid+1])   
                right = mid;
            else 
                left = mid+1;
        }
        return left;
    }
}