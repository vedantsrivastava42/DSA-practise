class reducetozero {
    public static void main(String[] args) {
        System.out.println(numberofsteps(54));
    }

    public static int numberofsteps(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return helper(num / 2, steps + 1);
        }
        return helper(num - 1, steps + 1);
    }
}
