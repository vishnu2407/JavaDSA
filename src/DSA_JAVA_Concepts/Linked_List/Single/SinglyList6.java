package DSA_JAVA_Concepts.Linked_List.Single;

public class SinglyList6 {
    //Rotate Linked List: Write a function to rotate a linked list to the right by k places.

    private ListNode head;

    private  static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void rotateRight(int k) {
        if(head == null || head.next == null) {
            return;
        }
        ListNode current = head;
        int count = 1;
        while(current.next != null) {
            current = current.next;
            count++;
        }
        current.next = head;
        k = k % count;
        k = count - k;
        while(k-- > 0) {
            current = current.next;
        }
        head = current.next;
        current.next = null;
    }
    public void printList() {
        ListNode current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        SinglyList6 list = new SinglyList6();
        list.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        list.printList();
        list.rotateRight(3);
        list.printList();
    }
}
