public class dynamic_custom extends custom {
    public dynamic_custom() {
        super(); // it will call Custom()
    }

    public dynamic_custom(int size) {
        super(size); // it will call custom(int size)
    }

    @Override

    public boolean push(int item) {
        if (this.isFull()) {
            // double the array Size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.push(item);
    }
}
