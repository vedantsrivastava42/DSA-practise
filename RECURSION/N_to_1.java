class N_to_1 {
    public static void main(String[] args) {
        // func(5);
        funrev(5);
    }

    static void func(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        func(n - 1);

    }

    static void funrev(int n) {
        if (n == 0)
            return;
        funrev(n - 1);
        System.out.println(n);

    }
}
