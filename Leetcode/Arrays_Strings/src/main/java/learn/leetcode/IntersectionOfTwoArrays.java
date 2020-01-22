package learn.leetcode;
/*
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

class Solution{

    public static int[]  intersectionTwoArrays(final int[] nums1, final int[] nums2) {
        if (nums1 == null)
            return nums2;
        if (nums2 == null)
            return nums1;

        final int n = nums1.length;
        final int m = nums2.length;
        final HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        final HashSet<Integer> set = new HashSet<>();
        final ArrayList<Integer> res = new ArrayList<>();
        for( int i =0; i< n; i++){
            map.put( nums1[i], map.getOrDefault(nums1[i], 0)+1);
        }

        for( int i=0 ;i<m ; i++){
            if( map.containsKey(nums2[i])){
                if( map.get(nums2[i]) < 0 ){
                    map.remove(nums2[i]);
                }
                else{
                    map.put( nums2[i], map.get( nums2[i])-1);
                    res.add( nums2[i]);
                }
            }
        }
        return ;

    }
}