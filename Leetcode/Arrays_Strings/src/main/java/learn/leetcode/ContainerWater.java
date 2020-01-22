package learn.leetcode;

class ContainerWater{
    public int maxArea(int [] height){
        // Area is l * h
        // Find any two indices which gives max Area: O(nC2) problem.
        // Area is function of l and height.
        // We can linearly scan inwards or outwards from center to get maxArea
        int l =0 ,r = height.length;
        int maxArea = 0;
        while( l < r){
            int area = (r-l+1) * Math.max( height[l] , height[r]);
            maxArea = Math.max( maxArea,area);
        }
        return maxArea;
    }
}