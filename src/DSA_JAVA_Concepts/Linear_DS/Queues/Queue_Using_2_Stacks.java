package DSA_JAVA_Concepts.Linear_DS.Queues;

import java.util.Stack;

public class Queue_Using_2_Stacks {
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();

    public static boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }
    // Enqueue operation
    public static void add(int data){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    //Dequeue operation
    public static int remove(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.pop();
    }
    //Peek operation
    public static int peek(){
        if(s1.isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return s1.peek();
    }
    //Printing the Queue
    public static void main(String[] args) {
        Queue_Using_2_Stacks q = new Queue_Using_2_Stacks();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

