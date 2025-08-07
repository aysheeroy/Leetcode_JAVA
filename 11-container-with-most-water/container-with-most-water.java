class Solution {
    public int maxArea(int[] height) {
        int area=0, max=0, front=0, rear=height.length-1;
        while(rear>front)
        {
            if(height[front]<height[rear]){
            area=Math.min(height[front], height[rear])*(rear-front);
            max=Math.max(max,area);
            front++;
            }
            else
            {
                area=Math.min(height[front], height[rear])*(rear-front);
                max=Math.max(max,area);
                rear--;
            }
        }
        return max;
    }
}