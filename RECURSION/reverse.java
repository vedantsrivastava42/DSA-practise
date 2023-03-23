class reverse {
    public static void main(String[] args) {
        System.out.println(funrev2(4281));
    }

    static int sum = 0;

    static void funrev(int n) {
        if (n == 0)
            return;
        int rem = n % 10;
        sum = sum * 10 + rem;
        funrev(n / 10);
    }

    // sometimes you might need some additional variables int the arguments
    // in that case,make another function
    // method 2 of same question
    static int funrev2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }
}
