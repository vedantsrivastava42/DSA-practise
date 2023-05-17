class custom {
    protected int[] data; // Static --> array will be full sometime.
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1; // pointer

    public custom() {
        this(DEFAULT_SIZE);
    }

    public custom(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;

    }

    public int pop() throws stackexception {
        if (isEmpty()) {
            throw new stackexception("Cannot pop from an empty stack!");
        }
        // int removes = data[ptr];
        // ptr--;
        // return removed;
        return data[ptr--];
    }

    public int peek() throws stackexception {
        if (isEmpty()) {
            throw new stackexception("Cannot peek from an empty stack!");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
