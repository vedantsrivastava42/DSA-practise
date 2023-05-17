class dynamicQueue extends circularQueue {
    public dynamicQueue() {
        super(); // it will call Custom()
    }

    public dynamicQueue(int size) {
        super(size); // it will call custom(int size)
    }

    @Override

    public boolean insert(int item) {
        if (this.isFull()) {
            // double the array Size
            int[] temp = new int[data.length * 2];

            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length]; // if f = 1 and i = 4 (1+4)%5 = 0
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }
}
