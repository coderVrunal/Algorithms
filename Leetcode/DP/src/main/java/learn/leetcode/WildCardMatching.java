package learn.leetcode;
class WildCardMatching{

    public static void main(String args[]){
        System.out.println( isMatch("abcd", "a**d"));
    }

    public static boolean isMatch( String s , String p){
        if( s == null || p == null ){
            return false;
        }

        int sLen = s.length();
        int pLen = p.length();
        int sIndex = 0, pIndex =0;
        int starIndex = -1, sTempIndex = -1;
        while( sIndex < sLen){
            if( pIndex < pLen && (s.charAt(sIndex) == p.charAt(pIndex) || p.charAt(pIndex) == '?' )){
                sIndex++; pIndex++;
            }

            else if( pIndex < pLen && (p.charAt(pIndex) == '*')){  
                // Condition when * is found and 
                starIndex = pIndex;
                sTempIndex = sIndex;
                pIndex++;
            }
            else if( starIndex < 0){
                // No previous star found that means no chance for adjusting the matching pattern window.
                return false;
            }
            else {
                // Previous star pattern should extend another character literal.
                sIndex = sTempIndex+1;
                pIndex = starIndex+1;
                sTempIndex = sIndex;
            }
        }
        for( int i =pIndex ; i< pLen ; i++ ){
            if( p.charAt(pIndex) != '*' ) 
                return false;
        }
        return true;
    } 
}