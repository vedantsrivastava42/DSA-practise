class move_zero {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 5, 7 };
        int n = nums.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                ans[j] = nums[i];
                j++;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(ans[k] + " ");
        }
    }
}