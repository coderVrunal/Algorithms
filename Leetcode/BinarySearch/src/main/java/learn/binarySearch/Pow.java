package learn.binarySearch;

class Pow{
    public static void main(String [] args){
        System.out.println( myPow(4.4, 2));
    }

    public static double myPow( double x, int n){
        long N = n;
        if( N < 0 ){
            N = -n;
            x = 1/x;
        }

        return helper( x, N );
    }

    public static double helper( double x, long n){
        if( n == 0)
            return 1;   
        double ans = helper( x , n/2);
        if( ans %2 == 0)
            return ans*ans;
        else 
            return ans*ans*x;
    }
}