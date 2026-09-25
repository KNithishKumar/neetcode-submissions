class Solution {
    public int maxArea(int[] heights) {
        
        int left = 0;
        int right = heights.length-1;

        int area = 0;
        int maxarea = 0;

        while(left<=right)
        {
            int m = Math.min(heights[left],heights[right]);
            area = m*(right-left);
            if(area>maxarea)
            {
                maxarea = area;
                if(heights[left]<heights[right])
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
            else  if(heights[left]<heights[right])
                {
                    left++;
                }
                else
                {
                    right--;
                }
        }
            
        return maxarea;
    }
}
