public class StackDemo {

    public static void main(String[] args) {
        Stack11 stack11 = new Stack11(10);
        stack11.push(8);
        stack11.push(12);
        stack11.push(18);
        stack11.print();
        stack11.pop();
        stack11.peek();
        stack11.pop();
        stack11.push(-5);
        stack11.print();
    }
}