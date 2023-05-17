public class customMain {
    public static void main(String[] args) throws Exception {
        dynamic_custom stack = new dynamic_custom(5);
        stack.push(34);
        stack.push(4);
        stack.push(86);
        stack.push(93);
        stack.push(33);
        stack.push(55);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
