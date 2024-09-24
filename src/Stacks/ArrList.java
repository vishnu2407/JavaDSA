package Stacks;
import java.util.ArrayList;

public class ArrList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<Integer>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push operation
        public static void push(int data) {
            list.add(data);
        }

        //pop operation
        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.remove(list.size() - 1);
        }

        //peek operation
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        System.out.printf("*************************************************************\n");
        System.out.printf("Test Stack Implementation using ArrayList in Java:\n");

        ArrList.Stack S = new ArrList.Stack();
        S.push(10);
        S.push(20);
        S.push(30);
        S.push(40);

        while (!S.isEmpty()) {
            //System.out.print("Top elements of stack:");
            System.out.print(S.peek() + "-->");
            S.pop();
        }
        System.out.println("Stack is empty: " + S.isEmpty());
    }
}

