import java.util.Arrays;

class runningsum {
    
        public static void runningSum(int[] nums) {
                int[] result = new int[nums.length];
        
                // Initialize first element of result array with first element in nums.
                result[0] = nums[0];
                for (int i = 1; i < nums.length; i++) {
                    // Result at index `i` is sum of result at `i-1` and element at `i`.
                    result[i] = result[i - 1] + nums[i];
                }
                System.out.println(Arrays.toString(result));
            }
        
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        runningSum(nums);

    }
}
