package DSA_JAVA_Concepts.Stacks;

import java.util.Stack;

public class Reverse {
    public static void pushAtBottom(int data, Stack<Integer> stack){
        if (stack.isEmpty()){
            stack.push(data);
            return;
        }
        int top = stack.pop();
        pushAtBottom(data, stack);
        stack.push(top);
    }

    public static void reverse(Stack<Integer> stack){
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        reverse(stack);
        pushAtBottom(top, stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Stack after pushing at bottom: ");
        //pushAtBottom(6, stack);
        reverse(stack);
        while (!stack.isEmpty()){
            System.out.print(stack.peek() + " ");
            stack.pop();
        }
    }
}
