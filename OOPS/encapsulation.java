public class encapsulation {
    public static void main(String[] args) {
        Laptop l1 = new Laptop();
        l1.setPrice(499);

        System.out.println(l1.getPrice());
    }

    public void doWork() {
        System.out.println("working");
    }

}

class Laptop {
    int ram;
    private int price;

    public void setPrice(int price) {
        // is the user an Admin
        boolean isAdmin = true;
        if (!isAdmin) {
            System.out.println("you cannot set the price");
        } else {
            this.price = price;
        }

    }

    public int getPrice() {
        return price;
    }
}