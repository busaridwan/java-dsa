package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackExample {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First req");
        stack.push("Second req");
        stack.push("Third req");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        stack.poll(); // handles NullException
        System.out.println(stack);

    }
}
