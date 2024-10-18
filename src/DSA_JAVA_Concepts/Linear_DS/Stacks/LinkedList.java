package DSA_JAVA_Concepts.Linear_DS.Stacks;

public class LinkedList {
    // Node class for stack implementation
    //By using LinkedList, we can implement stack using nodes
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top; // control flow exits here
            // this statement is unreachable
        }

        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data; // control flow exits here
            // this statement is unreachable
        }
    }

    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        System.out.printf("*************************************************************\n");
        System.out.printf("*** Stack Implementation using Linked List in Java: ***\n");

        Stack S = new Stack();
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
