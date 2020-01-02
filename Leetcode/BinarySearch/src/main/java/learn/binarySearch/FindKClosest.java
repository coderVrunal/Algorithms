package learn.binarySearch;

import java.util.Collections;
import java.util.List;

class FindKClosest {

    public static void main(String [] args){

    }

    public static List<Integer> findClosest( List<Integer> arr, int k, int x){
        // Input is sorted array.
        // we  search for x.    - Can be done with Binary search
        // Then expand outwards. upto k Size
        // 
        if( arr == null || arr.size() == 0 )
            return null;

        int n = arr.size();
        if( x <= arr.get(0))
            return arr.subList(0,k);
        else if( x >= arr.get(n-1) )
            return arr.subList(n-k,n);
        else {
            int index = Collections.binarySearch(arr, x);
            if( index < 0 )
                index = -index-1; //Make index 0;
            int low = Math.max( 0, index-k-1);
            int high = Math.max(n-1 , index+k-1);

            while( high-low > k-1){
                if( low < 0 || (x-arr.get(low)) <= arr.get(high) -x )
                    high--;
                else if ( high > arr.size()-1 || (x-arr.get(low) > (arr.get(high) -x )))
                    low++;
            }
            return arr.subList( low, high+1);
        }
    } 
}