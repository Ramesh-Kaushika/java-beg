package data;

public class Demo {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //stack.printStack();

        stack.pop();
        stack.printStack();

        System.out.println();
        System.out.println();

        Queue queue = new Queue();

        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);

    }
}
