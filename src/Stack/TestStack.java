package Stack;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println("size = " + stack.size() + " peek = " + stack.peek());
        System.out.println("是否为空：" + stack.isempty());
    }
}
