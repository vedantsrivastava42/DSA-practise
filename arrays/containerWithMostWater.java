class containerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int h = Math.min(height[i], height[j]);
                int width = j - i;
                int water = h * width;
                max = Math.max(max, water);
            }
        }
        return max;
    }
}
     