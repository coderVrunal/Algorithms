package learn.leetcode;
import java.util.HashMap;

/*
Given a string S and a string T, find the minimum window in
S which will contain all the characters in T in complexity O(n).

Input : S= "ADOBECODEBANC", T= "ABC"

out: "BANC"

*/

class MinWindowSubstring{

    public static void main(String [] args){

    }

    public static String minWindow(String s, String t){
        // Sliding window approach:
        // Maintain two pointers. Expand with right for substring with contains all letters of t
        // Start squeezing with left until constraint is broken
        // To lookup on substring if it contians all letters. I will use a hashmap storing variables and count

        HashMap<Character,Integer> map = new HashMap<>();
        for( Character c: t.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int required = map.size();
        int formed = 0;
        int left = 0, right = 0;
        int [] ans  = new int []{-1,0,0};
        HashMap<Character,Integer> windowCount = new HashMap<Character,Integer>();
        while( right < s.length() ){
            char c = s.charAt(right);
            int count = windowCount.getOrDefault(c, 0);
            windowCount.put( c, count+1);

            if( map.containsKey(c) && windowCount.get(c).intValue() == map.get(c).intValue() )
                formed++;

            while( left <=right && formed == required){
                c = s.charAt(left);
                if( ans[0] == -1 || right-left+1 > ans[0]){
                    ans[0] = right-left+1;
                    ans[1]=left;
                    ans[2]=right;
                }

                windowCount.put( c, windowCount.get(c)-1);
                if( map.containsKey(c) && windowCount.get(c).intValue() < map.get(c).intValue())
                    formed--;       
                left++;
            }
            right++;
        }
        return ans[0] == -1? "": s.substring(ans[1]+ ans[2]+1);
    }
}
