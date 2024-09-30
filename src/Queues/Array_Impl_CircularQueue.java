package Queues;

public class Array_Impl_CircularQueue {
    // declaring the array to store the elements of the queue and the front and rear indices of the circular queue and the size of the queue.
    // We will use the rear and front indices to implement the circular queue.

    static class Queue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // constructor to initialize the size of the queue
        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty() {
            return (front == -1 && rear == -1);
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;   // if the next index of rear is equal to front, then the queue is full.
        }

        // function to add an element to the queue
        public static void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            //1st element added to the queue
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //Dequeue --> O(1)
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int data = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return data;
        }

        // function to print the elements of the queue
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public static void main(String[] args) {

            Queue q = new Queue(5);
            q.enqueue(1);
            q.enqueue(2);
            q.enqueue(3);
            q.enqueue(4);
            q.enqueue(5);
            System.out.println(q.remove());
            q.enqueue(6);
            System.out.println(q.remove());
            q.enqueue(7);

            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
        }

    }
}
