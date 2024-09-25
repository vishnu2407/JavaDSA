package Stacks;

import java.util.Stack;

public class Inverse {

    // Recursive method to reverse the stack
    public static void inverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Recursively reverse the remaining stack
        inverse(stack);

        // Insert the top element at the bottom of the reversed stack
        insertAtBottom(stack, top);
    }

    // Helper method to insert an element at the bottom of the stack
    public static void insertAtBottom(Stack<Integer> stack, int data) {
        if (stack.isEmpty()) {
            stack.push(data);
            return;
        }

        // Remove the top element
        int top = stack.pop();

        // Recursively insert the element at the bottom
        insertAtBottom(stack, data);

        // Push the removed element back on top
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);

        inverse(stack);

        System.out.println("Inversed Stack: " + stack);
    }
}
// Output:
// Original Stack: [1, 2, 3, 4, 5]
//  Inversed Stack: [5, 4, 3, 2, 1]