package DSA_JAVA_Concepts.Linear_DS.Stacks;

import java.util.Stack;

public class Top {
    public static void pushAtTop(int data, Stack<Integer> stack){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        int temp = stack.pop();
        pushAtTop(data, stack);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        pushAtTop(6, stack);

//        while (!stack.isEmpty()) {
//            System.out.print(stack.peek() + " ");
//            stack.pop();
//        }
        System.out.print("Stack after pushing at top: ");
        System.out.println(stack);
        stack.pop();
        // Output: [6, 1, 2, 3, 4, 5]
    }
}
