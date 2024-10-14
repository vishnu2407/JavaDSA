package Linked_List.Single;

public class SinglyList3 {
    private ListNode head;

    // Class for each node
    public static class ListNode {
        private int data;
        public ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        SinglyList3 list = new SinglyList3();
        list.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);

        list.head.next = second;
        second.next = third;

        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("NULL");
}
}
