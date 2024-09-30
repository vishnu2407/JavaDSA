package Queues;

public class Array_Impl_Queue {

    //Queue class to implement the queue using an array implementation of a queue data structure in Java language.

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;

        Queue(int n) {     // constructor to initialize the size of the array
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //Enqueue --> O(1)
        public static void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //Dequeue  --> O(n)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            for(int i = 0;i < rear; i++){
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        //Peek --> O(n )
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        //q.add(6);
        //q.add(7);


        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}
