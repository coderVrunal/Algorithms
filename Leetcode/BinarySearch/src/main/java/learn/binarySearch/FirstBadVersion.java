package learn.binarySearch;


class FirstBadVersion{
    public static void main(String [] args){
        System.out.println( FirstBadVersion.searchBadVersion(10));
    }
    static boolean[] reference ;

    //Helper function not working
    FirstBadVersion(){
        reference = new boolean[15];
        for( int i=1;i < 5; i++)
            reference[i] = true;
        for( int i=5;i < 15; i++)
            reference[i] = false;
        
    }
    
    static boolean isBadVersion(int x){    
        return reference[x];
    }
    public static int searchBadVersion( int version){
        int left = 1, right = version, mid;
        while( left < right){
            mid = left + (right-left)/2;
            if( isBadVersion(mid))
                right = mid;
            else left = mid+1;
        }
        return left;
    }
}