class Solution {
    public int maxArea(int[] heights) {

        int l=0,r=heights.length-1;
        int max_area=0;
        while(l<r){
            int min_height=Math.min(heights[l],heights[r]);
            int area=min_height*(r-l);
             max_area=Math.max(max_area,area);
            if(heights[l]<=heights[r]){
                l++;
            }
            else{
                r--;
            }

        }
    return max_area;

    }
}
