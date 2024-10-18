package DSA_JAVA_Concepts.Linear_DS.Stacks;

import java.util.Stack;

public class Middle {
    public static void pushAtMiddle(int data, Stack<Integer> stack) {
        // Base case: If stack is empty, just push the data
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        int size = stack.size();
        int middle = size / 2;

        // Temporary stack to hold elements that are popped off
        Stack<Integer> tempStack = new Stack<>();

        // Pop the first 'middle' elements and store them in tempStack
        for (int i = 0; i < middle; i++) {
            tempStack.push(stack.pop());
        }

        // Push the new element into the original stack
        stack.push(data);

        // Push the stored elements back onto the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        pushAtMiddle(1, stack);
        pushAtMiddle(2, stack);
        pushAtMiddle(3, stack);
        pushAtMiddle(4, stack);
        pushAtMiddle(5, stack);

        System.out.println("Stack after pushing at middle:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
