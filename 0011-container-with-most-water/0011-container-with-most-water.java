class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h1 = height[left];
            int h2 = height[right];
            int currentHeight = 0;

            if (h1 < h2) {
                currentHeight = h1;
                left++;
            } else {
                currentHeight = h2;
                right--;
            }

            int currentWidth = right - left + 1;
            int currentArea = currentHeight * currentWidth;

            if (currentArea > maxArea) maxArea = currentArea;
        }
        return maxArea;
    }
}