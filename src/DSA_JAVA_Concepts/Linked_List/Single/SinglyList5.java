package DSA_JAVA_Concepts.Linked_List.Single;

public class SinglyList5 {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void reverseList() {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        SinglyList5 list = new SinglyList5();
        list.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        list.printList();
        list.reverseList();
        list.printList();
    }
}
