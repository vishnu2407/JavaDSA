package DSA_JAVA_Concepts.Stacks;

import java.util.Stack;

public class Bottom {
    public static void pushAtBottom(int data, Stack<Integer> stack){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        pushAtBottom(5, stack);
        System.out.println("Stack after pushing at bottom: ");
        while (!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();

        }
    }
}
