class Solution {
    public int maxArea(int[] height) {
        int s=0,e=height.length-1,maxarea=Integer.MIN_VALUE;
        while(s<=e){
            int width=e-s;
            int area=Math.min(height[s],height[e])*width;
            maxarea=Math.max(area,maxarea);
            if(height[s]<height[e]) s++;
            else e--;
        }
        return maxarea;
    }
}