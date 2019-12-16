package learn.binarySearch;

class SqrtX{

    public static void main(String [] args){
        System.out.println( sqrt(8));
    }

    public static int sqrt(int x){
        if( x <2 )
            return x;

        long left =1, right = x;
        long mid;
        while( left <= right ){
            mid = left+right/2;
            if( mid*mid == x)
                return (int)mid;

            if( mid*mid < x)
                left= mid+1;    
            else right = mid-1; 
        }
        return (int) right;
    }
}