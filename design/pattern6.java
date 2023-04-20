class pattern6 {
    public static void main(String[] args) {
        char ch = 65;
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }
} 